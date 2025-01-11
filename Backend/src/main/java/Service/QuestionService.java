package Service;

//package com.example.careerbackend.service;

import Model.Question;
import Reposetry.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getQuestions() {
        return questionRepository.get20Questions();
    }
}
