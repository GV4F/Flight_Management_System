package com.airline.exceptions;

public class ExcessLuggageWeightException extends Exception {
  public ExcessLuggageWeightException() {
    super();
  }

  public ExcessLuggageWeightException(String message) {
    super(message);
  }
}