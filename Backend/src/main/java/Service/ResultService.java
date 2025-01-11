package Service;

//package com.example.careerbackend.service;

import Model.Result;
import Reposetry.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {
    @Autowired
    private ResultRepository resultRepository;

    public Result getResults(Long userId) {
        return resultRepository.findById(userId).orElse(null);
    }
}
