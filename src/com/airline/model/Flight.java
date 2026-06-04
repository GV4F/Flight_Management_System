package com.airline.model;
import java.util.List;
import java.util.Random;
import com.airline.controller.*;

public class Flight {
  private Integer seatings;
  private List<Passenger> registeredPassenger;
  private String id = generateID();

  public Flight(Integer seatings) {
    this.seatings = seatings;
  }

  static public String generateID() {
    Random random = new Random();
    String id = "AA-";

    for(int i=0; i < 6; i++) {
      int num = random.nextInt(10);
      id+= String.valueOf(num);
    }  
    return id;
  }

  public Integer getSeatings() {
    return this.seatings;
  }

  public String getID() {
    return this.id;
  }

  public void addANewPassenger(Passenger passenger) {
    FullFlightValidation.flightValidation(this.seatings, registeredPassenger);
  }

  public void viewNumberOfOccupiedSeats(){
    System.out.printf("Total seats: %d%n Occupied Seats: %d", this.seatings, registeredPassenger.size());
  }
}
