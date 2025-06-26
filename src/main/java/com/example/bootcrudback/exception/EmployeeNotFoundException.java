package com.example.bootcrudback.exception;

public class EmployeeNotFoundException extends Exception {

  private static final Long serialVersionUID = 1L;

  public EmployeeNotFoundException() {
  }

  public EmployeeNotFoundException(String message) {
    super(message);
  }
}
