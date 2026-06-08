package com.airline.controller;

import java.util.List;
import com.airline.exceptions.*;

public class PassengerVIPValidation extends PassengerValidation{

  public PassengerVIPValidation(List<Double> luggageWeights) {
    super(luggageWeights);
  }

  @Override
  public void validateLuggage() throws ExcessLuggageWeightException {
    if (getLuggageWeights().size() > 3){
      String message = "Number of suitcases allowed has been exceeded: " + getLuggageWeights().size() + "/3";
      throw new ExcessLuggageWeightException(message);
    }
  }

  @Override
  public double validateLuggageWeights() {
    double penalty = 0;

    for(double suitcase:getLuggageWeights()){
      if(suitcase > 23) {
        System.out.println("A $.40.00 fine will be applied for excess weight");
        penalty += 40;
      }
    }
    return penalty;
  }
}