package com.airline.controller;

import java.util.List;
import com.airline.exceptions.*;
import com.airline.model.*;

public class FullFlightValidation {

  static public void flightValidation(int totalCapacity, List<Passenger> registeredPassenger) throws FullFlightException{
    if(registeredPassenger.size() >= totalCapacity) {
      throw new FullFlightException("The flight is full, no more passengers can be registered");
    }
  }
}