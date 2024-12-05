package org.isep.airlineManagment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Book {
    private int reservationNumber;
    private LocalDateTime reservationDate;
    private String status;
    public static HashMap<Passenger, ArrayList<Flight>> reservations;
    public static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


    public Book(int reservationNumber, LocalDateTime reservationDate, String status) {
        this.reservationNumber = reservationNumber;
        this.reservationDate = reservationDate;
        this.status = status;
        if (reservations == null) {
            reservations = new HashMap<Passenger, ArrayList<Flight>>();
        }
    }


    public static void addBook(Passenger passenger, Flight flight) {
        // Checking if the passenger already has reservations
        if (reservations.containsKey(passenger)) {
            // Adding the new reservation to the passenger's list of reservations
            ArrayList<Flight> l = reservations.get(passenger);
            l.add(flight);
            reservations.put(passenger, l);
        } else {
            // Creating a list of reservations for the passenger
            ArrayList<Flight> l = new ArrayList<Flight>();
            l.add(flight);
            reservations.put(passenger, l);
        }
    }


    public static void getBooks() {
        System.out.println("List of all flights");
        ArrayList<Flight> f;
        Passenger p;
        String s;
        for (Map.Entry m : reservations.entrySet()) {
            // Getting the values of the passenger and his flights
            s = "\t";
            p = (Passenger) m.getKey();
            f = (ArrayList<Flight>) m.getValue();
            for (Flight flight : f) {
                // Adding each flight in the list to the output
                s += "-ID Number : "+ flight.getFlightNumber() + ", origin : " + flight.getOrigin().getName() + ", destination : "+ flight.getdestination().getName() + ", Departure time : " + flight.getDepartureTime().format(timeFormatter) + ", Arrival time : " + flight.getArrivalDateTime().format(timeFormatter) + "\n\t";
            }
            System.out.print(p.getName() +" :\n"+ s);
        }
    }


    public static void removeBook(Passenger passenger, Flight flight) {
        // Checking if the passenger had a reservation on this flight, and removing it if true
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
