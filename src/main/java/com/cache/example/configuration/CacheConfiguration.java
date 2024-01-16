package com.cache.example.configuration;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfiguration {

    @Bean
    CaffeineCache sampleCache() {
        return new CaffeineCache("books", Caffeine.newBuilder().build());
    }
}
