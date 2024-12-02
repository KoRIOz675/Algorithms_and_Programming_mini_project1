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
