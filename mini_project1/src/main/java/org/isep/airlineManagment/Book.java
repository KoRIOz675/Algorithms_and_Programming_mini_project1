package org.isep.airlineManagment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Book {
    private int reservationNumber;
    private LocalDateTime reservationDate;
    private String status;
    public HashMap<Passenger, ArrayList<Flight>> reservations;


    public Book(int reservationNumber, LocalDateTime reservationDate, String status) {
        this.reservationNumber = reservationNumber;
        this.reservationDate = reservationDate;
        this.status = status;
    }


    public void addBook(Passenger passenger, Flight flight) {
        if (reservations.containsKey(passenger)) {
            ArrayList<Flight> l = reservations.get(passenger);
            l.add(flight);
            reservations.put(passenger, l);
        } else {
            ArrayList<Flight> l = new ArrayList<Flight>();
            l.add(flight);
            reservations.put(passenger, l);
        }
    }


    public int getReservationNumber() {
        return this.reservationNumber;
    }


    public LocalDateTime getReservationDate() {
        return this.reservationDate;
    }


    public String getStatus() {
        return this.status;
    }


    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }


    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }


    public void setStatus(String status) {
        this.status = status;
    }
}
