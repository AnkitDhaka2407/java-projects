package com.ankit.rest.webservices.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        // To Allow pop up instead of login page
        httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
        // All request needs to be authenticated
        httpSecurity.httpBasic(Customizer.withDefaults());
        // Disable csrf to allow POST and PUT
        httpSecurity.csrf(csrf -> csrf.disable());
        return httpSecurity.build();
    }
}
