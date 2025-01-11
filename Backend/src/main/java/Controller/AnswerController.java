package Controller;

//p/ackage com.example.careerbackend.controller;

import Model.Answer;
import Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @PostMapping("/{userId}")
    public ResponseEntity<String> submitAnswers(
        @PathVariable Long userId, 
        @RequestBody List<Answer> answers) {
        answerService.processAnswers(userId, answers);
        return ResponseEntity.ok("Answers submitted successfully!");
    }
}
