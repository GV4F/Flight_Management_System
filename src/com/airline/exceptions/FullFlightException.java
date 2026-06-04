package com.airline.exceptions;

public class FullFlightException extends Exception {

  public FullFlightException() {
    
  }

  public FullFlightException(String message) {
    super(message);
  }
}
