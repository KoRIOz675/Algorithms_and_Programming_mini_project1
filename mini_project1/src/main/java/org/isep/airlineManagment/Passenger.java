package org.isep.airlineManagment;


public class Passenger extends Person {
    private String passport;


    public Passenger(int id, String name, String address, String contact, String passport) {
        super(id, name, address, contact);
        this.passport = passport;
    }


    public void bookFlight(Flight flight) {
        Book.addBook(this, flight);
    }


    public void cancelFlight(Flight flight) {
        Book.removeBook(this,flight);
    }


    public void getReservations() {
        Book.getBooks();
    }


    public void getInfos() {
        System.out.println("Name : "+ this.name +
                "\nID : "+ this.id +
                "\nAddress : "+ this.address +
                "\nContact : "+ this.contact +
                "\nPassport : "+ this.passport);
    }


    public String getPassport() {
        return this.passport;
    }


    public void setPassport(String passport) {
        this.passport = passport;
    }


    @Override
    public String toString() {
        return "Name : "+ this.name +
                ", ID : "+ this.id +
                ", Address : "+ this.address +
                ", Contact : "+ this.contact +
                ", Passport : "+ this.passport;
    }
}
