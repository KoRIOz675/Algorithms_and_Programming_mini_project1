package org.isep.airlineManagment;

import java.time.LocalDateTime;

public class Flight {
    private int flightNumber;
    private Airport origin;
    private Airport destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalDateTime;
    private String status;


    public Flight(int flightNumber, Airport origin, Airport destination, LocalDateTime departure, LocalDateTime arrival, String status) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departure;
        this.arrivalDateTime = arrival;
        this.status = status;
    }


    public int getFlightNumber() {
        return this.flightNumber;
    }


    public Airport getOrigin() {
        return this.origin;
    }


    public Airport getdestination() {
        return this.destination;
    }


    public LocalDateTime getDepartureTime() {
        return this.departureTime;
    }


    public LocalDateTime getArrivalDateTime() {
        return this.arrivalDateTime;
    }


    public String getStatus() {
        return this.status;
    }


    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }


    public void setOrigin(Airport origin) {
        this.origin = origin;
    }


    public void setDestination(Airport destination) {
        this.destination = destination;
    }


    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }


    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }


    public void setStatus(String status) {
        this.status = status;
    }
}
