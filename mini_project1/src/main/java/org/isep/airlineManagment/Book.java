package org.isep.airlineManagment;

import java.time.LocalDateTime;

public class Book {
    private int reservationNumber;
    private LocalDateTime reservationDate;
    private String status;


    public Book(int reservationNumber, LocalDateTime reservationDate, String status) {
        this.reservationNumber = reservationNumber;
        this.reservationDate = reservationDate;
        this.status = status;
    }
}
