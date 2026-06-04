package com.airline.model;
import java.util.List;
import com.airline.controller.*;

public class Passenger {
  private String id; 
  private String name;
  private List<Double> luggageWeights;

  public Passenger(String id, String name, List<Double> luggageWeights) {
    this.id = id;
    this.name = name;
    this.luggageWeights = luggageWeights;
  }
  
  public String getID() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public List<Double> getLuggageWeights() {
    return luggageWeights;
  }
  
  public double calculateTotal() {

    final double price = 100.00;
    var validation = new PassengerValidation(this.luggageWeights);
    validation.validateLuggage();
    double penalty = validation.validateLuggageWeights() + price;

    return penalty;
  }
}