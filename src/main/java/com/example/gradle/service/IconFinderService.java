package com.example.gradle.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Service
public class IconFinderService {
    private final RestTemplate restTemplate = new RestTemplate();

    private static final String API_URL = "https://api.iconfinder.com/v4/styles";

    public String getAllStyles() {
        ResponseEntity<String> response = restTemplate.exchange(API_URL, HttpMethod.GET, null, String.class);
        return response.getBody();
    }
}
