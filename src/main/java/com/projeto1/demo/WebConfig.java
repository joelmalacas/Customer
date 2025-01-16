package com.projeto1.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permitir acesso a qualquer requisição no caminho /api/** a partir do localhost
        registry.addMapping("/api/**") // Aqui você pode ajustar o caminho para as suas APIs
                .allowedOrigins("http://localhost") // Permitir que o frontend na origem 'http://localhost' acesse a API
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permitir os métodos HTTP que você utiliza
                .allowedHeaders("*"); // Permite todos os cabeçalhos
    }
}
