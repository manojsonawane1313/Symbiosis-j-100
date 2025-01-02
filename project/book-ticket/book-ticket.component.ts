import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { BookticketService } from '../book-ticket.service';

@Component({
  selector: 'app-book-ticket',
  templateUrl: './book-ticket.component.html',
  styleUrls: ['./book-ticket.component.css']
})
export class BookTicketComponent {
  seatNumber: string = '';
  passenger = {
    name: '',
    email: '',
    phone: '',
  };
  bookingSuccess: boolean = false;
  bookingError: boolean = false;
  selectedBus: any;

  //seat
  seats: number[] = Array.from({ length: 40 }, (_, i) => i + 1);

  // First column sections
  firstColumnSection1: number[] = Array.from({ length: 10 }, (_, i) => i + 1);   // 1 to 10
  firstColumnSection2: number[] = Array.from({ length: 10 }, (_, i) => i + 11); // 11 to 20

  // Second column sections
  secondColumnSection1: number[] = Array.from({ length: 10 }, (_, i) => i + 21);  // 21 to 30
  secondColumnSection2: number[] = Array.from({ length: 10 }, (_, i) => i + 31);  // 31 to 40

  selectedSeat: number | null = null;

  constructor(private bookTicketService: BookticketService, private router: Router) {
    // Retrieve the state passed from the previous page
    const navigation = this.router.getCurrentNavigation();
    const state = navigation?.extras.state as { selectedBus: any };
    this.selectedBus = state?.selectedBus;
  }

  selectSeat(seatNumber: number): void {
    this.seatNumber = seatNumber.toString();
    this.bookTicketService.getSeatByBusNumber(this.selectedBus.busNumber).subscribe(
      (seats: string[]) => {
        if (seats.includes(this.seatNumber)) {
          alert(`seat no: ${this.seatNumber} is already booked`);
        } else {
          console.log(`Seat ${this.seatNumber} is available.`);
        }
      },
      (error) => {
        console.error('Error fetching seat numbers:', error);
      }
    );
  }

  bookTicket() {
    // Basic validation for required fields
    if (!this.passenger.name || !this.passenger.email || !this.passenger.phone) {
      alert('Please fill out all required fields.');
      return;
    }

    // Regular expression for email validation
    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if (!emailPattern.test(this.passenger.email)) {
      alert('Please enter a valid email address.');
      return;
    }

    // Regular expression for phone number validation
    const phonePattern = /^[0-9]{10}$/;
    if (!phonePattern.test(this.passenger.phone)) {
      alert('Please enter a valid 10-digit phone number.');
      return;
    }

    // Merge passenger and selected bus details
    const bookingDetails = {
      ...this.passenger,
      source: this.selectedBus.source,
      destination: this.selectedBus.destination,
      date: this.selectedBus.date,
      depart: this.selectedBus.sourceTime,
      arrival: this.selectedBus.destinationTime,
      price: this.selectedBus.price,
      busNumber: this.selectedBus.busNumber,
      seatno: this.seatNumber
    };

    this.bookTicketService.bookTicket(bookingDetails).subscribe(
      (response) => {
        this.bookingSuccess = true;
        this.bookingError = false;
        this.router.navigate(['/conformation'], { state: { passenger: this.passenger, selectedBus: this.selectedBus, seatNumber: this.seatNumber } });

        // Fetch and log all booked seats
        this.bookTicketService.getSeatByBusNumber(this.selectedBus.busNumber).subscribe(
          (bookedSeats: string[]) => {
            console.log('Booked seats:', bookedSeats);
          },
          (error) => {
            console.error('Error fetching all booked seats:', error);
          }
        );
      },
      (error) => {
        console.error('Error booking ticket:', error);
        this.bookingSuccess = false;
        this.bookingError = true;
      }
    );
  }
}
