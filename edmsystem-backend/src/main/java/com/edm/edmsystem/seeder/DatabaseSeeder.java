package com.edm.edmsystem.seeder;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class DatabaseSeeder implements CommandLineRunner {
    private static final String SEED_FLAG = "--seed";
    private final DocumentSeeder documentSeeder;

    @Override
    public void run(String... args) {
        if (Arrays.asList(args).contains(SEED_FLAG)) {
            documentSeeder.seed(50);
        }
    }
}
