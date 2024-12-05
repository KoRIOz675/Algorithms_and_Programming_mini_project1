warning: in the working copy of 'mini_project1/src/main/java/org/isep/Main.java', LF will be replaced by CRLF the next time Git touches it
[1mdiff --git a/mini_project1/src/main/java/org/isep/airlineManagment/Book.java b/mini_project1/src/main/java/org/isep/airlineManagment/Book.java[m
[1mindex 1f2b1c1..97b4256 100644[m
[1m--- a/mini_project1/src/main/java/org/isep/airlineManagment/Book.java[m
[1m+++ b/mini_project1/src/main/java/org/isep/airlineManagment/Book.java[m
[36m@@ -3,6 +3,7 @@[m [mpackage org.isep.airlineManagment;[m
 import java.time.LocalDateTime;[m
 import java.util.ArrayList;[m
 import java.util.HashMap;[m
[32m+[m[32mimport java.util.Map;[m
 [m
 public class Book {[m
     private int reservationNumber;[m
[36m@@ -31,6 +32,23 @@[m [mpublic class Book {[m
     }[m
 [m
 [m
[32m+[m[32m    public void getBooks() {[m
[32m+[m[32m        System.out.println("List of all flights");[m
[32m+[m[32m        for (Map.Entry m : reservations.entrySet()) {[m
[32m+[m[32m            System.out.println(m.getValue());[m
[32m+[m[32m        }[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m
[32m+[m[32m    public void removeBook(Passenger passenger, Flight flight) {[m
[32m+[m[32m        ArrayList<Flight> l = reservations.get(passenger);[m
[32m+[m[32m        if (l.contains(flight)) {[m
[32m+[m[32m            l.remove(flight);[m
[32m+[m[32m            reservations.put(passenger, l);[m
[32m+[m[32m        }[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m
     public int getReservationNumber() {[m
         return this.reservationNumber;[m
     }[m
[1mdiff --git a/mini_project1/src/main/java/org/isep/airlineManagment/Passenger.java b/mini_project1/src/main/java/org/isep/airlineManagment/Passenger.java[m
[1mindex 8a24145..815cafe 100644[m
[1m--- a/mini_project1/src/main/java/org/isep/airlineManagment/Passenger.java[m
[1m+++ b/mini_project1/src/main/java/org/isep/airlineManagment/Passenger.java[m
[36m@@ -1,7 +1,5 @@[m
 package org.isep.airlineManagment;[m
 [m
[31m-import java.util.ArrayList;[m
[31m-import java.util.List;[m
 [m
 public abstract class Passenger extends Person {[m
     private String passport;[m
[36m@@ -13,27 +11,27 @@[m [mpublic abstract class Passenger extends Person {[m
     }[m
 [m
 [m
[31m-    public void bookFlight(Flight flight) {[m
[31m-        [m
[32m+[m[32m    public void bookFlight(Flight flight, Book reservation) {[m
[32m+[m[32m        reservation.addBook(this, flight);[m
     }[m
 [m
 [m
[31m-    public void cancelFlight() {[m
[32m+[m[32m    public void cancelFlight(Flight flight, Book reservation) {[m
[32m+[m[32m        reservation.removeBook(this,flight);[m
     }[m
 [m
 [m
[31m-    public void getReservations() {[m
[32m+[m[32m    public void getReservations(Book reservation) {[m
[32m+[m[32m        reservation.getBooks();[m
     }[m
 [m
 [m
     public void getInfos() {[m
[31m-        {[m
[31m-            System.out.println("Name : "+ this.name +[m
[31m-                    "\nID : "+ this.id +[m
[31m-                    "\nAddress : "+ this.address +[m
[31m-                    "\nContact : "+ this.contact +[m
[31m-                    "\nPassport : "+ this.passport);[m
[31m-        }[m
[32m+[m[32m        System.out.println("Name : "+ this.name +[m
[32m+[m[32m                "\nID : "+ this.id +[m
[32m+[m[32m                "\nAddress : "+ this.address +[m
[32m+[m[32m                "\nContact : "+ this.contact +[m
[32m+[m[32m                "\nPassport : "+ this.passport);[m
     }[m
 [m
 [m
