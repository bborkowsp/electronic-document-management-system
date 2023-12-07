package com.edm.edmsystem.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class FakerConfig {
    @Bean
    public Faker faker() {
        final var seed = 123456789L;
        final var randomGenerator = new Random(seed);
        return new Faker(randomGenerator);
    }
}
