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
package com.github.sgoeschl.freemarker.demo.app.controller;

import com.github.sgoeschl.freemarker.sample.service.RestService;
import com.github.sgoeschl.freemarker.sample.util.Pair;
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
        final String title = ("Invoke Spring Boot Actuator Endpoint");
        final String subtitle = format("HTTP GET %s - %s - %s", url, statusCode, response.getHeaders().get("Date"));

        model.put("title", title);
        model.put("subtitle", subtitle);
        model.put("request", request);
        model.put("response", response);
        model.put("body", response.getBody());

        return "actuator";
    }
}
