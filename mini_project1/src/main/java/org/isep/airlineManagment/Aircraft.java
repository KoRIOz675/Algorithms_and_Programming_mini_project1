package org.isep.airlineManagment;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Aircraft {
    private String registration;
    private String model;
    private int capacity;
    private HashMap<LocalDateTime, LocalDateTime> timeTable;


    public Aircraft(String registration, String model, int capacity) {
        this.registration = registration;
        this.model = model;
        this.capacity = capacity;
        this.timeTable = new HashMap<LocalDateTime, LocalDateTime>();
    }


    public Boolean assignFlight(Flight newFlight) {
        if (this.checkAvailability(newFlight.getDepartureTime(), newFlight.getArrivalDateTime())) {
            this.timeTable.put(newFlight.getDepartureTime(), newFlight.getArrivalDateTime());
            return true;
        }
        return false;
    }


    public Boolean checkAvailability(LocalDateTime departureTime, LocalDateTime arrivalTime) {
        for (LocalDateTime departureDate : this.timeTable.keySet()) {
            if (departureTime.isAfter(departureDate)) {
                if (departureTime.isBefore(this.timeTable.get(departureDate))) {
                    return false;
                }
            };
            if (arrivalTime.isBefore(this.timeTable.get(departureDate))) {
                if (arrivalTime.isAfter(departureDate)) {
                    return false;
                }
            }
        }
        return true;
    }


    public String getRegistration() {
        return this.registration;
    }


    public String getModel() {
        return this.model;
    }


    public int getCapacity() {
        return this.capacity;
    }


    public HashMap<LocalDateTime, LocalDateTime> getTimetable() {
        return this.timeTable;
    }


    public void cancelFlight(LocalDateTime departure) {
        this.timeTable.remove(departure);
    }


    public void setRegistration(String registration) {
        this.registration = registration;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
