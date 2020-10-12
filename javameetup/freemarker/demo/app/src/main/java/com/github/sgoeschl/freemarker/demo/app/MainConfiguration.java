/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.sgoeschl.freemarker.demo.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.sgoeschl.freemarker.demo.app.filter.HttpCacheHeaderFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.OncePerRequestFilter;

import static java.time.Duration.ofMillis;

@Configuration

public class MainConfiguration {

    @Value("${my.server.page.static.cache-ttl:10000}")
    private int staticPageCacheTimeToLive;

    @Value("${my.server.resttemplate.connect-timeout:2000}")
    private int restTemplateConnectTimeout;

    @Value("${my.server.resttemplate.read-timeout:20000}")
    private int restTemplateReadTimeout;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(ofMillis(restTemplateConnectTimeout))
                .setReadTimeout(ofMillis(restTemplateReadTimeout))
                .build();
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * Show to set HTTP cache headers for more or less static FTL pages.
     */
    @Bean
    public FilterRegistrationBean<OncePerRequestFilter> httpCacheHeaderFilter() {
        final FilterRegistrationBean<OncePerRequestFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new HttpCacheHeaderFilter(staticPageCacheTimeToLive / 1_000));
        registrationBean.addUrlPatterns("/");
        return registrationBean;
    }
}
