package com;

public class SemaphoreExample {
	
	 public static void main(String[] args) throws InterruptedException{
		 
		   Reservation reservation = new Reservation();
	        BookingAgent bookingAgent = new BookingAgent(reservation);
	        for (int i = 1; i <= 5; i++) {
	            Thread passenger = new Thread(bookingAgent, "Passenger "+i);
	            passenger.start();
	        }
	 }

}
