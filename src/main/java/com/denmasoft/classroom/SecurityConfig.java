package com.denmasoft.classroom;

import javax.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{

    @Bean
    public PasswordEncoder encoder ()
    {
        return new BCryptPasswordEncoder (11);
    }

    @Override
    protected void configure (HttpSecurity httpSecurity) throws Exception
    {
        httpSecurity
                .csrf ().disable ()
                .logout ().disable ()
                .formLogin ().disable ()
                .sessionManagement ().sessionCreationPolicy (SessionCreationPolicy.STATELESS)
                .and ()
                .anonymous ()
                .and ()
                .exceptionHandling ().authenticationEntryPoint (
                (req, rsp, e) -> rsp.sendError (HttpServletResponse.SC_UNAUTHORIZED))
                .and ()
                .authorizeRequests ()
                .anyRequest ().permitAll();
    }
}

