/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.FirstTime;
import entity.Systemusers;
import java.security.Principal;
import java.util.Properties;
import javax.ejb.EJB;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import session.SystemusersFacade;
import session.UserManager;
import validation.FirstTimeValidator;

/**
 *
 * @author Xcelsia
 */
@Controller
@SessionAttributes({"command","vap","user"})
public class UserController {
    @EJB(mappedName = "java:global/bankingGuide/SystemusersFacade")
    private SystemusersFacade systemusersFacade;
    
    @Autowired
    private FirstTimeValidator firstTimeValidator;
    
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    private Systemusers currentUser;
    
    private Boolean vap = false;
    
    final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
    
    @RequestMapping(value="/register")
    public String register(Model model){
            model.addAttribute("systemusers", new Systemusers());
            return "user/register";
    }
    
    @RequestMapping(value="/register", method = { RequestMethod.POST, RequestMethod.PUT })
    public String registerUser(@Valid @ModelAttribute Systemusers systemusers, BindingResult result, HttpServletRequest request, HttpServletResponse response){
            if (result.hasErrors()) {
                    return "user/register";
            }		

          //systemusers.setUserPassword(passwordEncoder.encode(UserManager.generatePwd()));
          //systemusers.setUserPassword(passwordEncoder.encode(systemusers.getUserPassword()));
          systemusersFacade.create(systemusers);
          //sendMail(systemusers.getUserEmail(), systemusers.getUserName(), systemusers.getUserPassword());
          return "redirect:/login";
    }
    
    @RequestMapping(value="/users", method=RequestMethod.GET)
    public String viewUsers(Model model){
        model.addAttribute("users", systemusersFacade.findAll());
        return "admin/users";
    }
    
    @RequestMapping(value="/user/edit", method=RequestMethod.GET)
    public String editUser(Model model, @RequestParam String e, Principal principal){
            int id = Integer.valueOf(new String(Base64.decodeBase64(e)));
            System.out.println("id is"+id);
            model.addAttribute("command", systemusersFacade.find(id));
            return "user/edit";
    }
	
    @RequestMapping(value="/user/edit", method = { RequestMethod.POST, RequestMethod.PUT })
    public String updateUser(@Valid @ModelAttribute("command") Systemusers systemusers, BindingResult result, Errors errors, HttpServletRequest request){

            if (result.hasErrors()) {
                    return "user/edit";
            }	
            //systemusers.setUserPassword(passwordEncoder.encode(systemusers.getUserPassword()));
            systemusersFacade.edit(systemusers);
            return "redirect:/users";
    }
    
    @RequestMapping(value="/user/delete", method=RequestMethod.GET)
    public String deleteUser(Model model, @RequestParam String e, Principal principal){
            int id = Integer.valueOf(new String(Base64.decodeBase64(e)));
            systemusersFacade.remove(systemusersFacade.find(id));
            return "redirect:/users";
    }
    
    @RequestMapping(value="/login")
    public String login(Model model,Principal principal){
        if(principal!=null){
                return "redirect:/";
        }
        
        model.addAttribute("vap", vap);
        return "user/login";
    }
    
    @RequestMapping(value="/firsttime", method=RequestMethod.GET)
    public String firstlogin(Model model){        
        model.addAttribute("firsttime", new FirstTime());
        return "user/firsttimelogin";
    }
    
    @RequestMapping(value="/firsttime", method = { RequestMethod.POST, RequestMethod.PUT })
    public String newPassword(@ModelAttribute("firsttime") FirstTime firstTime, BindingResult result, Errors errors, HttpServletRequest request){
        firstTimeValidator.validate(firstTime, result);
        if (result.hasErrors()) {
            return "user/firsttimelogin";
        }
        currentUser = (Systemusers) request.getSession().getAttribute("user");
        currentUser.setUserPassword(firstTime.getPassword());
        currentUser.setActivation(1);
        systemusersFacade.edit(currentUser);
        return "redirect:/management";
    }
    
    
    /****** Email sending function ********************/
    public void sendMail(String email, String username, String password){
        String subject = "Account at Banking Guide";
        StringBuilder emailMessage = new StringBuilder();
        emailMessage.append("Your account at Banking Guide has been successfully opened \r\n");
        emailMessage.append("Email: "+ email +"\r\n");
        emailMessage.append("Username: "+ username +"\r\n");
        emailMessage.append("Password: "+ password+"\r\n");
        String host = "smtp.gmail.com";
        String to = email;
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");
        properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.debug", "true");
        properties.put("mail.store.protocol", "pop3");
        properties.put("mail.transport.protocol", "smtp");
        Session session = Session.getInstance(properties,
                        new javax.mail.Authenticator() {
                                protected PasswordAuthentication getPasswordAuthentication() {
                                        return new PasswordAuthentication("dynamicscyber0@gmail.com", "dynamics@");
                                }
                          }
                        );

        try {
                //Create default mime message object
                MimeMessage message = new MimeMessage(session);

                //Set from
                message.setFrom(new InternetAddress(email));

                //Set to
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                //Set subject
                message.setSubject(subject);

                //set actual message
                message.setText(emailMessage+"\r\n**From: "+"info@bankingguide.com");

                //Send message

                Transport.send(message);

                System.out.println("Sent message successfull...");


        }catch(MessagingException mex) {
                mex.printStackTrace();
        }
    }
    
}
