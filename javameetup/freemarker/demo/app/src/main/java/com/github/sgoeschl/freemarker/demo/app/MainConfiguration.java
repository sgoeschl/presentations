package com.github.sgoeschl.freemarker.demo.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.sgoeschl.freemarker.sample.service.RestService;
import com.github.sgoeschl.freemarker.sample.service.impl.SpringRestService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class MainConfiguration {

    private static final int HTTP_CONNECT_TIMOUT = 2;
    private static final int HTTP_READ_TIMOUT = 5;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofSeconds(HTTP_CONNECT_TIMOUT))
                .setReadTimeout(Duration.ofSeconds(HTTP_READ_TIMOUT))
                .build();
    }

    @Bean
    public RestService restService(RestTemplate restTemplate) {
        return new SpringRestService(restTemplate);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    }
}
