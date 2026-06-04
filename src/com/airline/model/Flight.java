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
    UnregisteredPassengerValidation.unregisteredPassenger(registeredPassenger, passenger);

    registeredPassenger.add(passenger);
  }

  public void viewNumberOfOccupiedSeats(){
    System.out.printf("Total seats: %d%n Occupied Seats: %d", this.seatings, registeredPassenger.size());
  }

  public void viewPassengerRegistered() {

    if(registeredPassenger.isEmpty()) {
      System.out.println("There are no occupied seats");
      return;
    }
    System.out.println("=================== REGISTERED PASSENGERS REPORT ===================");

    for (Passenger passenger: registeredPassenger) {

      System.out.printf("ID: %s%nName: %s%n", passenger.getID(), passenger.getName());
      System.out.println("Ristered Luggage: ");

      if(passenger.getLuggageWeights().isEmpty()){
        System.out.println("This passenger hasn't checked baggage");
      } else {
        List<Double> luggages = passenger.getLuggageWeights();

        for (int i = 0; i < luggages.size(); i++) {
          System.out.printf("%d Luggage: %.2f", (i+1), luggages.get(i));
        }
      }
      System.out.println("=========================================================");
    }
  }
}
