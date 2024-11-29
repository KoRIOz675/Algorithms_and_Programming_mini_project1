package org.isep.airlineManagment;

import java.util.Date;

public class Book {
    private int reservationNumber;
    private Date reservationDate;
    private String status;


    public Book(int reservationNumber, Date reservationDate, String status) {
        this.reservationNumber = reservationNumber;
        this.reservationDate = reservationDate;
        this.status = status;
    }
}
