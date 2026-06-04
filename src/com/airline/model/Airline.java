package com.airline.model;
import java.util.ArrayList;
import java.util.List;
import com.airline.controller.*;

public class Airline {

  private String name = "Nómada Air";
  private List<Flight> allFlights= new ArrayList<>();

  public String getName() {
    return name;
  }

  public void addFlight(Flight flight) {
    
    UnregisteredFlightValidation.unregisteredFlight(allFlights, flight);
    allFlights.add(flight);
  }
}