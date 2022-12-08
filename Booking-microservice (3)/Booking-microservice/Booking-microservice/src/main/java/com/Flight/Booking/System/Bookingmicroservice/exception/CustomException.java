package com.Flight.Booking.System.Bookingmicroservice.exception;

@SuppressWarnings("serial")
public class CustomException extends Exception {
    String message;
    public CustomException(String str) {
        message = str;
    }

    public CustomException() {

    }

   public String toString() {
        return ("An Exception Occured (Booking Service): "+message);
    }
}
