import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { QuestionService } from '../services/question.service';

@Component({
  selector: 'app-question',
  standalone: true,
  imports: [CommonModule, HttpClientModule],
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css'],
})
export class QuestionComponent implements OnInit {
  questions: any[] = [];
  answerOptions: any[] = [];
  selectedAnswers: string[] = [];

  constructor(private questionService: QuestionService, private router: Router) {}

  ngOnInit(): void {
    this.fetchQuestions();
  }

  fetchQuestions(): void {
    this.questionService.getQuestions().subscribe(
      (response) => {
        this.questions = response.question;
        this.answerOptions = response.answer_options.answer_option;
        this.selectedAnswers = new Array(this.questions.length).fill('');
      },
      (error) => {
        console.error('Error fetching questions:', error);
      }
    );
  }

  isSubmitEnabled(): boolean {
    return this.selectedAnswers.every((answer) => answer !== '');
  }

  updateAnswer(index: number, value: string): void {
    this.selectedAnswers[index] = value;
  }

  onSubmit(): void {
    if (this.isSubmitEnabled()) {
      alert('Your response has been submitted');
      this.router.navigate(['/result']);
    }
  }
}
