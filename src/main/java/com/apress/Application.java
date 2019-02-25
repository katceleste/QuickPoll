package com.apress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


 // this is a convenience annotation that adds all of the following:
/*
 * @Configuration tags the class as a source of bean definitions for the application context
 * @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings,
 * other beans, and various property settings. **/

@SpringBootApplication
@ComponentScan(basePackages={"com.apress.controller", "com.apress.domain"})
@EnableJpaRepositories("com.apress.repository")
public class Application {
    public static void main(String[] args) {
        /* The main() method uses Spring Boot's Spring*/
        SpringApplication.run(Application.class, args);
    }
}
