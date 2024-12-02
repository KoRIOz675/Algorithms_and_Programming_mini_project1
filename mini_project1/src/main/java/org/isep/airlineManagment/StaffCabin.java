package org.isep.airlineManagment;

import java.time.LocalDateTime;

public abstract class StaffCabin extends Employee {
    private String qualification;


    public StaffCabin(int id, String name, String address, String contact, int numberEmployee, LocalDateTime hiringDate, String qualification) {
        super(id, name, address, contact, numberEmployee, hiringDate);
        this.qualification = qualification;
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
                    "\nQualification : "+ this.qualification);
        }
    }


    public String getQualification() {
        return this.qualification;
    }


    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
