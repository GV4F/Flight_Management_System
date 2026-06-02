package com.airline.controller;
import java.util.List;
import com.airline.exceptions.ExcessBaggageCountException;


public class PassengerVIPValidation extends PassengerValidation{

  public PassengerVIPValidation(List<Double> luggageWeights) {
    super(luggageWeights);
  }

  @Override
  public void validateLuggage() {
    try {
      if (getLuggageWeights().size() > 3){
        throw new ExcessBaggageCountException("Number of suitcases allowed has been exceeded");
      }
    } catch (ExcessBaggageCountException e) {
      System.out.printf("%s.%nNumber of suitcases allowed: 1, Your suitcases: %d", e.getMessage(), getLuggageWeights().size());
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