package com.mark.flight;

public class Flight {
  private int passengers;
  private int seats;

  public Flight(int numSeats) {
    this.seats = numSeats;
    this.passengers = 0;
  }

  public void addPassenger() {
    if (passengers < seats)
      this.passengers += 1;
    else
      handleTooMany();
  }

  private void handleTooMany() {
    System.out.println("Flight is full!");
  }

  public int passengers() {
    return this.passengers;
  }
}
