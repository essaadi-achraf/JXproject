package com.example.demo.config;

import com.example.demo.service.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSAPI.class); // Register the correct resource
        return jerseyServlet;
    }
}
