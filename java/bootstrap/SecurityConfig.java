package bootstrap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.springframework.security.web.util.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public DataSource dataSource() throws Exception {
        Context ctx = new InitialContext();
        return (DataSource) ctx.lookup("jdbc/bankingguide");
    }
    

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
    		.jdbcAuthentication()
    			.dataSource(dataSource())
    			//.passwordEncoder(passwordEncoder)
    			.usersByUsernameQuery(
                                "select username,userpassword, enabled from systemusers where username=?")
                        .authoritiesByUsernameQuery(
                                "SELECT systemusers.username, systemusers.usertype FROM systemusers WHERE username=?");
    }
 
    @Override
	protected void configure(HttpSecurity http) throws Exception {
 
	  http
            .authorizeRequests()
                    .antMatchers("/").permitAll()
                    .antMatchers("/admin**").access("hasRole('ADMIN')")
                    //.antMatchers("/user**").authenticated()
                    .and()
            .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .and()
            .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    .permitAll()
                    .and()
            .rememberMe()
                    .key("rembkey");
	  		
 
	}
    
    @Bean
    public HttpSessionRequestCache requestCache()
    {
    	return new HttpSessionRequestCache();
    }
    
    @Bean(name="authenticationManager")
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
