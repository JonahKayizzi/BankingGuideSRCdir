package bootstrap;

import javax.servlet.ServletContext;

import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.multipart.support.MultipartFilter;

//import exception.MultipartExceptionHandler;

@Order(1)
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
//	@Override
//    protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
//        //insertFilters(servletContext, new MultipartExceptionHandler(), new HiddenHttpMethodFilter(), new MultipartFilter(), new OpenEntityManagerInViewFilter());
//        insertFilters(servletContext, new HiddenHttpMethodFilter(), new MultipartFilter(), new OpenEntityManagerInViewFilter());
//    }
}
