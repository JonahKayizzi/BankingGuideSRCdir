/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Systemusers;
import entity.Useraccessrights;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import session.AccessManager;
import session.Instituition;
import session.SystemusersFacade;
import session.UseraccessrightsFacade;

/**
 *
 * @author Xcelsia
 */

@Controller
@SessionAttributes({"command","vap","user"})
public class AdminController {
    @EJB(mappedName = "java:global/bankingGuide/UseraccessrightsFacade")
    private UseraccessrightsFacade useraccessrightsFacade;
    
    @EJB(mappedName = "java:global/bankingGuide/SystemusersFacade")
    private SystemusersFacade systemusersFacade;
    
    @RequestMapping(value="/accessrights" , method={RequestMethod.GET})
    public String manageRights(Model model, HttpServletRequest request){
        Instituition instituition = new Instituition();
        if(request.getSession().getAttribute("command") == null ){            
            instituition.setName("admin");
        }else {
            instituition = (Instituition)request.getSession().getAttribute("command");
        }
        
        List<Useraccessrights> useraccessrights = new ArrayList<>();
        String selectedUsr = instituition.getName();
        switch (selectedUsr) {
            case "admin":
                useraccessrights = useraccessrightsFacade.findByUserRecent("admin");
                break;
            case "manager":
                useraccessrights = useraccessrightsFacade.findByUserRecent("manager");
                break;
            case "bank":
                useraccessrights = useraccessrightsFacade.findByUserRecent("bank");
                break;
            case "editor":
                useraccessrights = useraccessrightsFacade.findByUserRecent("editor");
                break;
            case "insurance":
                useraccessrights = useraccessrightsFacade.findByUserRecent("insurance");
                break;
            case "microfinance":
               useraccessrights = useraccessrightsFacade.findByUserRecent("microfinance");
                break;
            case "sacco":
                useraccessrights = useraccessrightsFacade.findByUserRecent("sacco");
                break;
            case "moneytransfer":
                useraccessrights = useraccessrightsFacade.findByUserRecent("moneytransfer");
                break;
        }
        model.addAttribute("command", instituition);
        model.addAttribute("useraccessrights",useraccessrights);
        return "admin/manage_access_rights";
    }
    
    @RequestMapping(value="/accessrights", method = { RequestMethod.POST, RequestMethod.PUT })
    public String selectRights(@ModelAttribute("command")Instituition instituition ,Model model, HttpServletRequest request){
        request.getSession().setAttribute("command", instituition);
        return "redirect:/accessrights";
    }
    
    @RequestMapping(value="/addrights" ,method={RequestMethod.GET})
    public String addRights(Model model){
        model.addAttribute("accessrights", new Useraccessrights());
        return "admin/add_access_rights";
    }
    
    @RequestMapping(value="/addrights", method = { RequestMethod.POST, RequestMethod.PUT })
    public String saveAddedRights(@ModelAttribute("accessrights") Useraccessrights useraccessrights){
        useraccessrights.setUsrAcsRtsStatus(Boolean.TRUE);
        useraccessrightsFacade.create(useraccessrights);
        return "redirect:/accessrights";
    }
    
    @RequestMapping(value="/management" ,method={RequestMethod.GET})
    public String management(Model model, HttpServletRequest request, HttpSession session){
        Systemusers u = (Systemusers)session.getAttribute("user");//(Systemusers)request.getSession().getAttribute("user");
        System.out.println("Logged user" + u.getUserName());
        if (u.getActivation()==null){           
            return "redirect:/firsttime";
        }
        return "admin/dashboard";
    }
    
    @RequestMapping(value="/user/create")
    public String createUser(Model model){
            model.addAttribute("systemusers", new Systemusers());
            return "admin/create_user";
    }
    
    @RequestMapping(value="/user/create", method = { RequestMethod.POST, RequestMethod.PUT })
    public String saveUser(@Valid @ModelAttribute Systemusers systemusers, BindingResult result, HttpServletRequest request, HttpServletResponse response){
            if (result.hasErrors()) {
                    return "admin/create_user";
            }		

          //systemusers.setUserPassword(passwordEncoder.encode(UserManager.generatePwd()));
          //systemusers.setUserPassword(passwordEncoder.encode(systemusers.getUserPassword()));
          systemusersFacade.create(systemusers);
          //sendMail(systemusers.getUserEmail(), systemusers.getUserName(), systemusers.getUserPassword());
          return "redirect:/users";
    }
}
