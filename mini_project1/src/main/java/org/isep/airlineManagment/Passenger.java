package org.isep.airlineManagment;

import java.sql.SQLOutput;

public abstract class Passenger extends Person {
    private String passport;


    public Passenger(int id, String name, String address, String contact, String passport) {
        super(id, name, address, contact);
        this.passport = passport;
    }


    public void bookFlight() {

    }


    public void cancelFlight() {

    }


    public void getReservations(int id) {

    }


    @Override
    public void getInfos() {
        {
            System.out.println("Name : "+ this.name);
            System.out.println("ID : "+ this.id);
            System.out.println("Address : "+ this.address);
            System.out.println("Contact : "+ this.contact);
            System.out.println("Passport : "+ this.passport);
        }
    }


    public String getPassport() {
        return this.passport;
    }


    public void setPassport(String passport) {
        this.passport = passport;
    }
}
