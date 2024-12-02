package org.isep.airlineManagment;

import java.util.ArrayList;
import java.util.List;

public abstract class Passenger extends Person {
    private String passport;


    public Passenger(int id, String name, String address, String contact, String passport) {
        super(id, name, address, contact);
        this.passport = passport;
    }


    public void bookFlight(Flight flight) {
        
    }


    public void cancelFlight() {
    }


    public void getReservations() {
    }


    public void getInfos() {
        {
            System.out.println("Name : "+ this.name +
                    "\nID : "+ this.id +
                    "\nAddress : "+ this.address +
                    "\nContact : "+ this.contact +
                    "\nPassport : "+ this.passport);
        }
    }


    public String getPassport() {
        return this.passport;
    }


    public void setPassport(String passport) {
        this.passport = passport;
    }
}
