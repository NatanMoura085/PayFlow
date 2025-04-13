package com.api.infrastructure.config;

import com.api.infrastructure.security.JWTConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
      //  http.oauth2Login(Customizer.withDefaults());
        http.csrf(csrf->csrf.disable());
        http.oauth2ResourceServer(oauth2 -> oauth2
                .jwt(jwt -> jwt.jwtAuthenticationConverter(new JWTConverter())));

//        http.authorizeHttpRequests(requests -> {
//            requests.requestMatchers("/orders/**").hasAuthority("USER");
//            requests.requestMatchers("/api/v1/payments/**").hasAuthority("USER");
//            requests.requestMatchers("/users/**").hasAuthority("ADMIN");
//            requests.anyRequest().denyAll();
//        });

        return http.build();
    }
}
