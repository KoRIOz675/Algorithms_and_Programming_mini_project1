package org.isep.airlineManagment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Book {
    private int reservationNumber;
    private LocalDateTime reservationDate;
    private String status;
    public static HashMap<Passenger, ArrayList<Flight>> reservations;
    public static boolean isReservationsNotInitialised = true;


    public Book(int reservationNumber, LocalDateTime reservationDate, String status) {
        this.reservationNumber = reservationNumber;
        this.reservationDate = reservationDate;
        this.status = status;
        if (isReservationsNotInitialised) {
            isReservationsNotInitialised = false;
            reservations = new HashMap<Passenger, ArrayList<Flight>>();
        }
    }


    public static void addBook(Passenger passenger, Flight flight) {
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


    public static void getBooks() {
        System.out.println("List of all flights");
        for (Map.Entry m : reservations.entrySet()) {
            System.out.println(m.getValue());
        }
    }


    public static void removeBook(Passenger passenger, Flight flight) {
        ArrayList<Flight> l = reservations.get(passenger);
        if (l.contains(flight)) {
            l.remove(flight);
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
