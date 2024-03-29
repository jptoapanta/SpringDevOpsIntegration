package com.example.springdevopsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDevOpsIntegrationApplication {

    @GetMapping("/get")
    public String getMessage(){
        return "Welcome To SOLAR PANEL ESPE 2024";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDevOpsIntegrationApplication.class, args);
    }

}
