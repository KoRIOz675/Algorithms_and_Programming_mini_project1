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


    public void getFlight() {
    }


    @Override
    public void getInfos() {
        {
            System.out.println("Name : "+ this.name);
            System.out.println("ID : "+ this.id);
            System.out.println("Address : "+ this.address);
            System.out.println("Contact : "+ this.contact);
            System.out.println("Licence : "+ this.licence);
            System.out.println("Total flight hours : "+ this.flightHours);
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
