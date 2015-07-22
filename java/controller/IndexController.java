/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Systemusers;
import java.security.Principal;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import session.SystemusersFacade;

/**
 *
 * @author Xcelsia
 */
@Controller
@SessionAttributes({"vap","user"})
public class IndexController {
    
    @EJB(mappedName = "java:global/bankingGuide/SystemusersFacade")
    SystemusersFacade systemusersFacade;
    
    @RequestMapping("/index")
    public String index(Model model, Principal principal,HttpServletRequest request){
        if(principal != null && request.getSession().getAttribute("user")==null){
            model.addAttribute("user", systemusersFacade.findByUserName(principal.getName()));
        }
        
        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model){
        return "view/home";
    }
}
