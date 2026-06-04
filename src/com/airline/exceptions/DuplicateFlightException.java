package com.airline.exceptions;

public class DuplicateFlightException extends Exception {
  
  public DuplicateFlightException() {
    super();
  }

  public DuplicateFlightException(String message) {
    super(message);
  }
}
