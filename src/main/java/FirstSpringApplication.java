package com.FT05.CloudCA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;

@SpringBootApplication
public class FirstSpringApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(FirstSpringApplication.class, args);
    }
}

