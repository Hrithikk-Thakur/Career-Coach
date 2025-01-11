package Service;

//package com.example.careerbackend.service;

import Model.Answer;
import Model.Result;
import Reposetry.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private ResultRepository resultRepository;

    public void processAnswers(Long userId, List<Answer> answers) {
        int engineering = 0, medical = 0, arts = 0, commerce = 0;

        for (Answer answer : answers) {
            switch (answer.getSelectedOption()) {
                case "A": engineering++; break;
                case "B": medical++; break;
                case "C": arts++; break;
                case "D": commerce++; break;
            }
        }

        String bestCareer = determineBestCareer(engineering, medical, arts, commerce);

        Result result = new Result();
        result.setUserId(userId);
        result.setEngineeringScore(engineering);
        result.setMedicalScore(medical);
        result.setArtsScore(arts);
        result.setCommerceScore(commerce);
        result.setBestCareer(bestCareer);

        resultRepository.save(result);
    }

    private String determineBestCareer(int engineering, int medical, int arts, int commerce) {
        int maxScore = Math.max(Math.max(engineering, medical), Math.max(arts, commerce));
        if (maxScore == engineering) return "Engineering";
        if (maxScore == medical) return "Medical";
        if (maxScore == arts) return "Arts";
        return "Commerce";
    }
}
