import { Component } from '@angular/core';
import { Router } from '@angular/router';  // Import Router

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  constructor(private router: Router) {}  // Inject Router

  navigateToQuestion(): void {
    console.log('Navigating to question page'); // Add this for debugging
    this.router.navigate(['/question']);
  }
}
