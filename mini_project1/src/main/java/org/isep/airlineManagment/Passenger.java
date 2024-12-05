package org.isep.airlineManagment;


public abstract class Passenger extends Person {
    private String passport;


    public Passenger(int id, String name, String address, String contact, String passport) {
        super(id, name, address, contact);
        this.passport = passport;
    }


    public void bookFlight(Flight flight, Book reservation) {
        reservation.addBook(this, flight);
    }


    public void cancelFlight(Flight flight, Book reservation) {
        reservation.removeBook(this,flight);
    }


    public void getReservations(Book reservation) {
        reservation.getBooks();
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
}
