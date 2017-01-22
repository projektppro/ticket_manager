package com.ppro.config;

import com.ppro.security.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by Arci on 14.11.2016.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Qualifier("customSuccessHandler")
    @Autowired
    private CustomSuccessHandler customSuccessHandler;
    @Autowired
    private CustomUserDetailService userDetailService;


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("1").roles("ADMIN");
        auth.userDetailsService(userDetailService);
        auth.authenticationProvider(authenticationProvider());
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

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailService);
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }
}
