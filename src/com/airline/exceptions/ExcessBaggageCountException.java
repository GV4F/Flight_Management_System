package com.airline.exceptions;

public class ExcessBaggageCountException extends Exception{
  public ExcessBaggageCountException() {
    super();
  }

  public ExcessBaggageCountException(String message) {
    super(message);
  } 
}