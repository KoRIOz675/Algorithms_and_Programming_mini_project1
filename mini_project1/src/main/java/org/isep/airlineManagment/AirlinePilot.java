package org.isep.airlineManagment;

import java.time.LocalDateTime;

public abstract class AirlinePilot extends Employee {

    private String licence;
    private int flightHours;

    public AirlinePilot(int id, String name, String address, String contact, int numberEmployee, LocalDateTime hiringDate, String licence, int flightHours) {
        super(id, name, address, contact, numberEmployee, hiringDate);
        this.flightHours = flightHours;
        this.licence = licence;
    }


    public void assignFlight() {
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
                    "\nLicence : "+ this.licence +
                    "\nTotal flight hours : "+ this.flightHours);
        }
    }


    public String getLicence() {
        return this.licence;
    }


    public int getFlightHours() {
        return this.flightHours;
    }


    public void setLicence(String licence) {
        this.licence = licence;
    }


    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }
}
