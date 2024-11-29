package org.isep.airlineManagment;

import java.util.Date;

public class AirlinePilot extends Employee{

    private String licence;
    private int flightHours;

    public AirlinePilot(String name, String address, String contact, int numberEmployee, Date hiringDate, String licence, int flightHours) {
        super(name, address, contact, numberEmployee, hiringDate);
        this.flightHours = flightHours;
        this.licence = licence;
    }

    public void assignFlight(){
    }

    public void getFlight(){
    }
}
