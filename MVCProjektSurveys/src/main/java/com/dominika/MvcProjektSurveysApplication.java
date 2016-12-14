package com.dominika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class MvcProjektSurveysApplication {

    public static void main(String[] args) {

        SpringApplication.run(MvcProjektSurveysApplication.class, args);
    }
}
