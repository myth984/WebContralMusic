package com.myth.contralmusic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
public class Config {
    @Bean(name="robot")
    public Robot robot() throws AWTException {

            return new Robot();

    }
}
