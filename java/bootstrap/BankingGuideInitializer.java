/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootstrap;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author Xcelsia
 */
public class BankingGuideInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    protected Class<?>[] getRootConfigClasses() { return new Class[] {SecurityConfig.class};}

    protected Class<?>[] getServletConfigClasses()  { return new Class[] {BankingGuideConfig.class};}

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
