package org.isep.airlineManagment;

import java.time.LocalDateTime;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalDateTime;
    private String status;


    public Flight(int flightNumber, String origin, String destination, LocalDateTime departure, LocalDateTime arrival, String status) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departure;
        this.arrivalDateTime = arrival;
        this.status = status;
    }
}
