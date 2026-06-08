package com.airline.controller;

import java.util.List;
import com.airline.exceptions.*;

public class PassengerValidation {
  private List<Double> luggageWeights;

  public PassengerValidation(List<Double> luggageWeights) {
    this.luggageWeights = luggageWeights;
  }

  // : With this method we can validate the number of suitcases
  public void validateLuggage() throws ExcessLuggageWeightException {
    if (this.luggageWeights.size() > 1){
      String message = "Number of suitcases allowed has been exceeded: " + this.luggageWeights.size() + "/1";
      throw new ExcessLuggageWeightException(message);
    }
  }

  // : With this method we can validate the weight of suitcases
  public double validateLuggageWeights() {
    double penalty = 0;
    if (this.luggageWeights.get(0) > 8) {
      System.out.println("\nA $.40.00 fine will be applied for excess weight\n");
      penalty += 40;
    }
    return penalty;
  }

  public List<Double> getLuggageWeights() {
    return this.luggageWeights;
  }
}
