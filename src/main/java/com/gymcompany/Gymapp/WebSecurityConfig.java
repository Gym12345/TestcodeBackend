//package com.gymcompany.Gymapp;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.security.web.csrf.CsrfTokenRepository;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .csrf()
//                .csrfTokenRepository(csrfTokenRepository())
//            .and()
//            .authorizeRequests()
//                .anyRequest().permitAll();
//    }
//    
//    private CsrfTokenRepository csrfTokenRepository() {
//        CookieCsrfTokenRepository repository = CookieCsrfTokenRepository.withHttpOnlyFalse();
//        return repository;
//    }
//}