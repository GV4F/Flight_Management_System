package com.airline.exceptions;

public class DuplicatePassengerException extends Exception{
  public DuplicatePassengerException() {
    super();
  }

  public DuplicatePassengerException(String message) {
    super(message);
  }
}
