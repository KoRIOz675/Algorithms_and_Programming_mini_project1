package org.isep.airlineManagment;

import java.time.LocalDateTime;
import java.util.HashMap;

public class StaffCabin extends Employee {
    private String qualification;
    private HashMap<LocalDateTime, LocalDateTime> timeTable;


    public StaffCabin(int id, String name, String address, String contact, int numberEmployee, String qualification, LocalDateTime hiringDate) {
        super(id, name, address, contact, numberEmployee, hiringDate);
        this.qualification = qualification;
        this.timeTable = new HashMap<LocalDateTime, LocalDateTime>();
    }


    public boolean assignFlight(Flight newFlight) {
        if (this.checkAvailability(newFlight.getDepartureTime(), newFlight.getArrivalDateTime())) {
            this.timeTable.put(newFlight.getDepartureTime(), newFlight.getArrivalDateTime());
            return true;
        }
        return false;
    }


    public Boolean checkAvailability(LocalDateTime departureTime, LocalDateTime arrivalTime) {
        for (LocalDateTime departureDate : this.timeTable.keySet()) {
            // Checking if the flight finishes during another already assigned flight
            if (departureTime.isAfter(departureDate)) {
                if (departureTime.isBefore(this.timeTable.get(departureDate))) {
                    return false;
                }
            };
            // Checking if the flight starts during another already assigned flight
            if (arrivalTime.isBefore(this.timeTable.get(departureDate))) {
                if (arrivalTime.isAfter(departureDate)) {
                    return false;
                }
            }
        }
        return true;
    }


    public void getFlight(Flight flight) {
        System.out.println("Flight Number : "+ flight.getFlightNumber() +
                "\nOrigin : "+ flight.getOrigin() +
                "\nDestination : "+ flight.getdestination() +
                "\nDeparture time : "+ flight.getDepartureTime() +
                "\n Arrival time : "+ flight.getArrivalDateTime() +
                "\nStatus : "+ flight.getStatus());
    }


    public void getInfos() {
        {
            System.out.println("Name : "+ this.name +
                    "\nID : "+ this.id +
                    "\nAddress : "+ this.address +
                    "\nContact : "+ this.contact +
                    "\nQualification : "+ this.qualification +
                    "\nHiring Date : "+ this.hiringDate);
        }
    }


    public String getQualification() {
        return this.qualification;
    }


    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    @Override
    public String toString() {
        return "Name : "+ this.name +
                ", ID : "+ this.id +
                ", Address : "+ this.address +
                ", Contact : "+ this.contact +
                ", Qualification : "+ this.qualification +
                ", Hiring Date : "+ this.hiringDate;
    }
}
