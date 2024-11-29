package org.isep.airlineManagment;

import java.util.Date;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private Date departureTime;
    private Date arrivalDateTime;
    private String status;


    public Flight(int flightNumber, String origin, String destination, Date departure, Date arrival, String status) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departure;
        this.arrivalDateTime = arrival;
        this.status = status;
    }
}
