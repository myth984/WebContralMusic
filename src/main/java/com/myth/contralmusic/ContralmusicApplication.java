package com.myth.contralmusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ContralmusicApplication {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(ContralmusicApplication.class, args);
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(ContralmusicApplication.class);
//        builder.headless(false).run(args);
    }

}
