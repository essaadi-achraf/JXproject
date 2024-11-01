package com.example.demo;

import com.example.demo.entity.Compte;
import com.example.demo.enumeration.Typecompte;
import com.example.demo.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);

    }
    @Bean
    CommandLineRunner start(CompteRepository compteRepository) {
        return args -> {
            compteRepository.save(new Compte(null,Math.random()*9000,new Date(), Typecompte.COURANT));
            compteRepository.save(new Compte(null,Math.random()*9000,new Date(), Typecompte.EPARGNE));
            compteRepository.save(new Compte(null,Math.random()*9000,new Date(), Typecompte.EPARGNE));
            compteRepository.findAll().forEach(compte -> {
                System.out.println(compte);
            });

        };
    }

}
