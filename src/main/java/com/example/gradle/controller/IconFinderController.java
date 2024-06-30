package com.example.gradle.controller;
import com.example.gradle.service.IconFinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IconFinderController {

    @Autowired
    private IconFinderService iconFinderService;

    @GetMapping("/styles")
    public String getAllStyles() {
        return iconFinderService.getAllStyles();
    }
}