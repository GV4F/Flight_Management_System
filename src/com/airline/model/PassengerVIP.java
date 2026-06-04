package com.airline.model;
import java.util.List;
public class PassengerVIP extends Passenger {
  
  public PassengerVIP (String id, String name, List<Double> luggageWeights) {
    super(id, name, luggageWeights);
  }

  public void validateLuggage() {
    if (getLuggageWeights().size() > 3) {
      System.out.println("Baggage allowance exceeded");
    }

    for (double suitcase: getLuggageWeights()) {
      if (suitcase > 23) {
        System.out.println("Luggage exceeds the permitted weight");
        System.out.println("A $.40.00 fine will be applied for excess weight");
      }
    }
  }
}