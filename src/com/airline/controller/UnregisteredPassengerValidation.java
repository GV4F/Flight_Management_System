package com.airline.controller;

import java.util.List;
import com.airline.exceptions.*;
import com.airline.model.*;

public class UnregisteredPassengerValidation {
  
  static public void unregisteredPassenger(List<Passenger> registeredPassenger, Passenger passenger) throws DuplicatePassengerException {
    for(Passenger user:registeredPassenger) {
      if(user.getID() == passenger.getID()) {
        throw new DuplicatePassengerException("This user is already registered");
      }
    }
  }
}