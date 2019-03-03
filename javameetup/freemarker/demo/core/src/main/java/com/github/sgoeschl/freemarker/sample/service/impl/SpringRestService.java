package com.github.sgoeschl.freemarker.sample.service.impl;

import com.github.sgoeschl.freemarker.sample.util.Pair;
import com.github.sgoeschl.freemarker.sample.service.RestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static java.util.Collections.singletonList;
import static org.springframework.http.HttpMethod.GET;

public class SpringRestService implements RestService {

    private static final Logger LOG = LoggerFactory.getLogger(RestService.class);

    @Value("${local.server.port:8080}")
    private String port;

    private final RestTemplate restTemplate;

    public SpringRestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Pair<HttpEntity<String>, ResponseEntity<String>> exchange(String url, HttpMethod method) {
        final HttpHeaders headers = new HttpHeaders();
        headers.setAccept(singletonList(MediaType.ALL));
        final HttpEntity<String> request = new HttpEntity<>(headers);
        return new Pair<>(request, restTemplate.exchange(url, GET, request, String.class));
    }

    @Override
    public String getLogfile() {
        final HttpHeaders headers = new HttpHeaders();
        headers.setAccept(singletonList(MediaType.ALL));
        final String url = String.format("http://localhost:%s/actuator/logfile", port);
        final HttpEntity<String> entity = new HttpEntity<>(headers);
        return restTemplate.exchange(url, GET, entity, String.class).getBody();
    }
}
