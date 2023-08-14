package com.api.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CrudApplication.class, args);
        Environment env = context.getEnvironment();
        String port = env.getProperty("server.port");
		String username = env.getProperty("spring.datasource.username");
        
        System.out.printf("The server is running on port: %s, Username: %s ", port, username);
    }
}
