package com.github.sgoeschl.freemarker.sample.service;

import com.github.sgoeschl.freemarker.sample.util.Pair;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public interface RestService {

    Pair<HttpEntity<String>, ResponseEntity<String>> exchange(String url, HttpMethod method);

    String getLogfile();
}
