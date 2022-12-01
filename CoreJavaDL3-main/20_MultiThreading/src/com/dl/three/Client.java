package com.dl.three;

class SeatsAvailable {

	int seats = 3;

	public synchronized void bookMovieTickets(String uname, int totalSeats) throws InterruptedException {

		if (seats >= totalSeats && totalSeats > 0) {
			System.out.println("Hello " + uname + " You have booked " + totalSeats + " Tickets ");
			seats = seats - totalSeats;
			System.out.println("Tickets left: " + seats);
			Thread.sleep(2000);
		} else {
			System.out.println("Hello " + uname + " Seats Not Available ");
		}
	}
}

class Tickets extends Thread {

	SeatsAvailable seatsAvailable;
	String userName;
	int noOfSeats;

	public Tickets(SeatsAvailable seatsAvailable, String userName, int noOfSeats) {
		this.seatsAvailable = seatsAvailable;
		this.userName = userName;
		this.noOfSeats = noOfSeats;
	}

	public void run() {
		try {
			seatsAvailable.bookMovieTickets(userName, noOfSeats);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class Client {

	public static void main(String[] args) {

		SeatsAvailable seatsAvailable = new SeatsAvailable();
		Tickets t1 = new Tickets(seatsAvailable, "Sai Kiran", 2);
		Tickets t2 = new Tickets(seatsAvailable, "Sai Ram", 2);

		t1.start();
		t2.start();
	}
}
