package org.isep.airlineManagment;

import java.util.ArrayList;
import java.util.List;

public abstract class Passenger extends Person {
    private String passport;
    private List<Book> books;


    public Passenger(int id, String name, String address, String contact, String passport, List<Book> books) {
        super(id, name, address, contact);
        this.passport = passport;
        this.books = new ArrayList<>();
    }


    public void bookFlight() {
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


    public List<Book> getBook() {
        return this.books;
    }


    public void setPassport(String passport) {
        this.passport = passport;
    }


    public void setBook(List<Book> book) {
        this.books = book;
    }
}
