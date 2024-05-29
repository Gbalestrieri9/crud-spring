package com.angularspring.crudspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .cors().and() // Adiciona suporte a CORS
            .csrf().disable() // Desabilita CSRF para facilitar testes, habilite em produção com configuração adequada
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/api/courses/**").permitAll() // Permite acesso público ao endpoint /api/courses
                .anyRequest().authenticated() // Requer autenticação para todas as outras requisições
            );
        return http.build();
    }
}