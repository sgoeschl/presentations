package com.github.sgoeschl.freemarker.demo.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.sgoeschl.freemarker.demo.app.filter.HttpCacheHeaderFilter;
import com.github.sgoeschl.freemarker.sample.service.RestService;
import com.github.sgoeschl.freemarker.sample.service.impl.SpringRestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.OncePerRequestFilter;

import java.time.Duration;

@Configuration
public class MainConfiguration {

    private static final int HTTP_CONNECT_TIMOUT = 2;
    private static final int HTTP_READ_TIMOUT = 5;

    @Value("${my.server.resource.cache.ttl:10000}")
    private int resourceCacheTimeToLifeInMs;

    @Value("${my.server.resttemplate.connect-timeout:2000}")
    private int restTemplateConnectTimeout;

    @Value("${my.server.resttemplate.read-timeout:20000}")
    private int restTemplateReadTimeout;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMillis(restTemplateConnectTimeout))
                .setReadTimeout(Duration.ofMillis(restTemplateReadTimeout))
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

    @Bean
    public FilterRegistrationBean<OncePerRequestFilter> httpCacheHeaderFilter() {
        final FilterRegistrationBean<OncePerRequestFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new HttpCacheHeaderFilter(resourceCacheTimeToLifeInMs / 1_000));
        registrationBean.addUrlPatterns("/");
        return registrationBean;
    }
}
