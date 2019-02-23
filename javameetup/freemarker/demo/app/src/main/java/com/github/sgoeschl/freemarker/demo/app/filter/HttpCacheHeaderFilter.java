package com.github.sgoeschl.freemarker.demo.app.filter;

import org.springframework.http.HttpHeaders;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HttpCacheHeaderFilter extends OncePerRequestFilter {

    private final int seconds;

    public HttpCacheHeaderFilter(int seconds) {
        this.seconds = seconds;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        if (seconds > 0) {
            response.addHeader(HttpHeaders.EXPIRES, expiresHttpHeader());
        }

        filterChain.doFilter(request, response);
    }

    private String expiresHttpHeader() {
        return new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss zzz").format(new Date(System.currentTimeMillis() + seconds * 1000));
    }
}
