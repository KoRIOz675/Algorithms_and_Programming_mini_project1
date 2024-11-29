package org.isep.airlineManagment;

public class Passenger extends Person{

    String passport;
    Book reservationNumber;

    public Passenger(String name, String address, String contact, String passport) {
        super(name, address, contact);
        this.passport = passport;
    }

    public void bookFlight(){

    }

    public void cancelFlight(Book reservationNumber){

    }

    public void getReservations(Book reservationNumber){

    }
}
