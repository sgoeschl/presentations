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

    private final int millis;

    public HttpCacheHeaderFilter(int millis) {
        this.millis = millis;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        if (millis > 0) {
            response.addHeader(HttpHeaders.EXPIRES, expiresHttpHeader());
        }

        filterChain.doFilter(request, response);
    }

    private String expiresHttpHeader() {
        return simpleDateFormat().format(new Date(System.currentTimeMillis() + millis));
    }

    private static SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss zzz");
    }
}
