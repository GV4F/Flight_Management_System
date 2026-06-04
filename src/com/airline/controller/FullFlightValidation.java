package com.airline.controller;

import java.util.List;
import com.airline.exceptions.*;
import com.airline.model.*;

public class FullFlightValidation {

  static public void flightValidation(int totalCapacity, List<Passenger> registeredPassenger) {
    try {
      if(registeredPassenger.size() > totalCapacity) {
        throw new FullFlightException("The flight is full, no more passengers can be registered");
      }
    } catch (FullFlightException e) {
      System.out.println(e.getMessage());
    }
  }
}