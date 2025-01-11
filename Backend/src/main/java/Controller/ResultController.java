package Controller;

//package com.example.careerbackend.controller;

import Model.Result;
import Service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/results")
public class ResultController {
    @Autowired
    private ResultService resultService;

    @GetMapping("/{userId}")
    public Result getResults(@PathVariable Long userId) {
        return resultService.getResults(userId);
    }
}
