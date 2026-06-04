package com.airline.controller;

import java.util.List;
import com.airline.model.*;
import com.airline.exceptions.*;

public class UnregisteredFlightValidation {
  
  static public void unregisteredFlight(List<Flight>allFlights, Flight flight) {
    try {
      for(Flight plane: allFlights) {
        if(plane.getID() == flight.getID()) {
          throw new DuplicateFlightException("This flight is already registered");
        }
      }
    } catch (DuplicateFlightException e) {
      System.out.printf("The flight %s: %s", flight.getID(), e);
    }
  }
}
