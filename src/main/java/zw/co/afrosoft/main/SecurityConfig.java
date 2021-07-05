package zw.co.afrosoft.main;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.crypto.password.*;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
        auth.inMemoryAuthentication()
                .withUser("h190850x")
                .password("sshamu")
                .roles("USER")
                .and()
                .withUser("h190767h")
                .password(",tmatanga")
                .roles("USER")
                .and()
                .withUser("h190500")
                .password("cngoya")
                .roles("ADMIN");

    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
