package org.isep.airlineManagment;

public class Passenger extends Person {
    private String passport;


    public Passenger(String name, String address, String contact, String passport) {
        super(name, address, contact);
        this.passport = passport;
    }


    public void bookFlight() {

    }


    public void cancelFlight() {

    }


    public void getReservations(int id) {

    }


    public String getPassport() {
        return this.passport;
    }


    public void setPassport(String passport) {
        this.passport = passport;
    }
}
