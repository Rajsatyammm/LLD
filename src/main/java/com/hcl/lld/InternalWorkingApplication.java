package com.hcl.lld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InternalWorkingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(InternalWorkingApplication.class, args);
    }
}
