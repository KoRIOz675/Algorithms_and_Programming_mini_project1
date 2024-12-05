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
        ArrayList<Flight> f;
        Passenger p;
        String s;
        for (Map.Entry m : reservations.entrySet()) {
            s = "\t";
            p = (Passenger) m.getKey();
            f = (ArrayList<Flight>) m.getValue();
            for (Flight flight : f) {
                s += "-ID Number : "+ flight.getFlightNumber() + ", origin : " + flight.getOrigin().getName() + ", destination : "+ flight.getdestination().getName() + ", Departure time : " + flight.getDepartureTime().format(timeFormatter) + ", Arrival time : " + flight.getArrivalDateTime().format(timeFormatter) + "\n\t";
            }
            System.out.print(p.getName() +" :\n"+ s);
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
