package com.ppro.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Arci on 14.11.2016.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Qualifier("customSuccessHandler")
    @Autowired
    private CustomSuccessHandler customSuccessHandler;
//    @Qualifier("customUserDetailService")
//    @Autowired
//    private CustomUserDetailService userDetailService;


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("mkyong").password("123456").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("1").roles("ADMIN");
//        auth.userDetailsService(userDetailService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().
                antMatchers("/").permitAll().
                antMatchers("/login").permitAll().
                antMatchers("/**").permitAll().
                antMatchers("/adm/**").access("hasRole('ROLE_ADMIN')").
//                antMatchers("/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')").
                and().formLogin().loginPage("/login").
                successHandler(customSuccessHandler).
                usernameParameter("ssoId").passwordParameter("password").
                and().csrf().
                and().exceptionHandling().accessDeniedPage("/acces_denied");

    }
}
