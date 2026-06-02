package com.airline.controller;

import java.util.List;
import com.airline.exceptions.*;

public class PassengerValidation {
  private List<Double> luggageWeights;

  public PassengerValidation(List<Double> luggageWeights) {
    this.luggageWeights = luggageWeights;
  }

  public void validateLuggage() {
    try {
      if (this.luggageWeights.size() > 1){
        throw new ExcessBaggageCountException("Number of suitcases allowed has been exceeded");
      }
    } catch (ExcessBaggageCountException e) {
      System.out.printf("%s.%nNumber of suitcases allowed: 1, Your suitcases: %d", e.getMessage(), this.luggageWeights.size());
    }
  }

  public double validateLuggageWeights() {
    double penalty = 0;
    if (this.luggageWeights.get(0) > 8) {
      System.out.println("A $.40.00 fine will be applied for excess weight");
      penalty += 40;
    }
    return penalty;
  }

  public List<Double> getLuggageWeights() {
    return this.luggageWeights;
  }
}
