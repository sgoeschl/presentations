package com.github.sgoeschl.freemarker.demo.app.controller;

import com.github.sgoeschl.freemarker.sample.util.Pair;
import com.github.sgoeschl.freemarker.sample.service.RestService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

import static java.lang.String.format;
import static org.springframework.http.HttpMethod.GET;

@Controller
public class ViewController {

    private final RestService restService;

    public ViewController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/ui/actuator")
    public String logile(
            Map<String, Object> model,
            @RequestParam("endpoint") String endpoint) {
        final String url = "http://localhost:8080/actuator/" + endpoint;
        final Pair<HttpEntity<String>, ResponseEntity<String>> pair;
        pair = restService.exchange(url, GET);

        final HttpEntity<String> request = pair.getLeft();
        final ResponseEntity<String> response = pair.getRight();
        final HttpStatus statusCode = response.getStatusCode();
        final String subtitle = format("HTTP GET %s - %s - %s", url, statusCode, response.getHeaders().get("Date"));

        model.put("title", "Logfile");
        model.put("subtitle", subtitle);
        model.put("request", request);
        model.put("response", response);
        model.put("body", response.getBody());

        return "actuator";
    }

}
