package com.mark.flight;
import com.mark.flight.Flight;

public class Main {
  public static void main(String[] args) {
    Flight flight = new Flight(10);
    System.out.println(flight.passengers());
    flight.addPassenger();
    System.out.println(flight.passengers());

    while (flight.passengers() != 10)
      flight.addPassenger();

    System.out.println(flight.passengers());
  }
}
