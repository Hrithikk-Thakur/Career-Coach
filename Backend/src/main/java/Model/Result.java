package Model;

//package com.example.careerbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Result {
    @Id
    private Long userId;

    private int engineeringScore;
    private int medicalScore;
    private int artsScore;
    private int commerceScore;
    private String bestCareer;

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public int getEngineeringScore() {
        return engineeringScore;
    }
    public void setEngineeringScore(int engineeringScore) {
        this.engineeringScore = engineeringScore;
    }
    public int getMedicalScore() {
        return medicalScore;
    }
    public void setMedicalScore(int medicalScore) {
        this.medicalScore = medicalScore;
    }
    public int getArtsScore() {
        return artsScore;
    }
    public void setArtsScore(int artsScore) {
        this.artsScore = artsScore;
    }
    public int getCommerceScore() {
        return commerceScore;
    }
    public void setCommerceScore(int commerceScore) {
        this.commerceScore = commerceScore;
    }
    public String getBestCareer() {
        return bestCareer;
    }
    public void setBestCareer(String bestCareer) {
        this.bestCareer = bestCareer;
    }
}
