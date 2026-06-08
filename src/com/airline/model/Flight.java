package com.airline.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.airline.controller.*;
import com.airline.exceptions.*;

public class Flight {
  private Integer seatings;
  private List<Passenger> registeredPassenger = new ArrayList<>();
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

  public List<Passenger> getRegisteredPassenger() {
    return registeredPassenger;
  }

  public void addANewPassenger(Passenger passenger) {
    try {
      var validation = new PassengerValidation(passenger.getLuggageWeights());
      FullFlightValidation.flightValidation(this.seatings, getRegisteredPassenger());
      UnregisteredPassengerValidation.unregisteredPassenger(getRegisteredPassenger(), passenger);
      validation.validateLuggage();
  
      registeredPassenger.add(passenger);
    } catch(FullFlightException | DuplicatePassengerException | ExcessLuggageWeightException e) {
      System.out.printf("%n%s%n", e.getMessage());
    }

  }

  public void viewNumberOfOccupiedSeats(){
    System.out.printf("%nTotal seats: %d%nOccupied Seats: %d%n", this.seatings, registeredPassenger.size());
  }

  public void viewPassengerRegistered() {

    if(registeredPassenger.isEmpty()) {
      System.out.println("\nThere are no occupied seats\n");
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
      System.out.println("\n=========================================================\n");
    }
  }
}
