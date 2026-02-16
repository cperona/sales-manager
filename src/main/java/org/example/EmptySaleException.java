package org.example;

public class EmptySaleException extends RuntimeException {
    public EmptySaleException(String message) {
        super(message);
    }
    public EmptySaleException(String message, Throwable cause) {
      super(message, cause);
    }
}
