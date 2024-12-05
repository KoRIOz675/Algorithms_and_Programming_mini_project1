package org.isep;

import org.isep.airlineManagment.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Creation of the times for the flight's timetable.
        LocalDateTime time_2024_12_05_10_12_15 = LocalDateTime.of(2024,12,5,10,12,15);
        LocalDateTime time_2026_12_05_10_12_15 = LocalDateTime.of(2026,12,5,10,12,15);
        LocalDateTime time_2024_12_06_10_12_15 = LocalDateTime.of(2024,12,6,10,12,15);
        LocalDateTime time_2024_02_05_15_25_36 = LocalDateTime.of(2024,2,5,15,25,36);
        LocalDateTime time_2025_01_18_23_59_25 = LocalDateTime.of(2025,1,18,23,59,25);
        LocalDateTime time_2027_07_18_14_25_59 = LocalDateTime.of(2027,7,18,14,25,59);
        LocalDateTime time_2027_07_18_15_25_59 = LocalDateTime.of(2027,7,18,15,25,59);

        // Creation of the airports
        Airport CDG = new Airport("CDG", "Paris", "Paris-Charles-de-Gaulle");
        Airport LHR = new Airport("LHR", "London", "London-Heathrow");

        // Creation of the aircraft
        Aircraft boeing747 = new Aircraft("ABC","Boeing 747",416);
        Aircraft airbusA380 = new Aircraft("DEF","Airbus A380",853);

        // Creations of 3 passengers
        Passenger passenger1 = new Passenger(3000001, "Thomas", "10 rue de Vanves, 92130 Issy-les-Moulineaux", "+33769418460", "FR78AAAAAA");
        Passenger passenger2 = new Passenger(3000002, "Rémy", "Place Lenoncourt, 51100 Reims", "+33782691801", "FR78BBBBBB");
        Passenger passenger3 = new Passenger(3000003, "Seb", "28 rue Notre-Dame-des-Champs, 75006 Paris", "+33101010101", "FR78CCCCCC");

        // Creation of 3 pilots
        AirlinePilot pilot1 = new AirlinePilot(1000001,"Florian","16 Rue d'Antrain, 35000 Rennes","mail",1,LocalDateTime.now(),"I can fly, trust me",500);
        AirlinePilot pilot2 = new AirlinePilot(1000002,"Steve","adress1","mail2",2,LocalDateTime.now(),"What does this button do ?",200);
        AirlinePilot pilot3 = new AirlinePilot(1000003,"Marilou","adress2","mail3",3,LocalDateTime.now(),"I afraid of heights",1000);

        // Creation of 3 crew members
        StaffCabin crew1 = new StaffCabin(2000001,"Alex","adress3","contact",4,LocalDateTime.now(),"Trust me");
        StaffCabin crew2 = new StaffCabin(2000002,"George","address4","contact2",5,LocalDateTime.now(),"I'm an engineer");
        StaffCabin crew3 = new StaffCabin(2000004,"Ilno","address5","contact3",6,LocalDateTime.now(),"I think that this should go right here");

        // Creation of the flights
        // flight1 flies from 05/12/2024 to 05/12/2026
        // flight2 flies from 06/12/2024 to 18/01/2025
        // flight3 flies from 05/02/2024 to 06/12/2024
        // flight4 flies from 06/12/2024 to 18/07/2027
        // flight5 flies from 18/07/2027 to 18/07/2027
        // flight6 flies from 18/07/2027 to 18/07/2027
        Flight flight1 = new Flight(000001, CDG, LHR, time_2024_12_05_10_12_15, time_2026_12_05_10_12_15, "Currently Flying");
        Flight flight2 = new Flight(000002, CDG, LHR, time_2024_12_06_10_12_15, time_2025_01_18_23_59_25, "Currently Flying");
        Flight flight3 = new Flight(000003, CDG, LHR, time_2024_02_05_15_25_36, time_2024_12_06_10_12_15, "Currently Flying");
        Flight flight4 = new Flight(000004, CDG, LHR, time_2024_12_06_10_12_15, time_2027_07_18_14_25_59, "Currently Flying");
        Flight flight5 = new Flight(000005, CDG, LHR, time_2027_07_18_14_25_59, time_2027_07_18_15_25_59, "Currently Flying");
        Flight flight6 = new Flight(000006, CDG, LHR, time_2027_07_18_14_25_59, time_2027_07_18_15_25_59, "Currently Flying");

        // Assigning the planes to each flight
        // Return either 'True' if the assignment was successful, or return 'False' otherwise
        System.out.println(boeing747.assignFlight(flight1));        // True, first flight assigned
        System.out.println(boeing747.assignFlight(flight2));        // False, the flight's fly time is during the fly time of flight1
        System.out.println(boeing747.assignFlight(flight3));        // False, the flight arrives during the fly time of flight1
        System.out.println(boeing747.assignFlight(flight4));        // False, the flight departs during the fly time of flight1
        System.out.println(boeing747.assignFlight(flight5));        // True, the flight is after the fly time of flight1
        System.out.println(airbusA380.assignFlight(flight6));       // True, assignation of another aircraft to the flight6

        // Assigning the pilots to the plane ('True' if success, 'False' otherwise)
        System.out.print("\n");                                     // Blank space for visibility
        System.out.println(pilot1.assignFlight(flight1));           // True, successfully assigned pilot1 to flight1
        System.out.println(pilot1.assignFlight(flight2));           // False, pilot1 cannot be assigned to 2 flights
        System.out.println(pilot2.assignFlight(flight2));           // True, successfully assigned pilot2 to flight2

        // Assigning the pilots to the plane ('True' if success, 'False' otherwise)
        System.out.print("\n");                                     // Blank space for visibility
        System.out.println(crew1.assignFlight(flight1));            // True, successfully assigned crew1 to flight1
        System.out.println(crew1.assignFlight(flight2));            // False, crew1 cannot be assigned to 2 flights
        System.out.println(crew2.assignFlight(flight2));            // True, successfully assigned crew2 to flight2

        // Creation, adding and removing reservations
        System.out.print("\n");                                     // Blank space for visibility
        // Creation of a book object for a new reservation (with a new id, and a new time of reservation)
        Book bookFlight1 = new Book(1,LocalDateTime.now(),".");
        // Adding twice flight1 to the reservation
        passenger1.bookFlight(flight1);
        passenger1.bookFlight(flight1);
        // Creation of a book object for a new reservation
        Book bookFlight2 = new Book(2,LocalDateTime.now(),".");
        // Adding flight2 to the reservation
        passenger1.bookFlight(flight2);
        // Creation of a book object for a new reservation
        Book bookFlight3 = new Book(3,LocalDateTime.now(),".");
        // Adding flight3 to the reservation
        passenger1.bookFlight(flight3);
        // Output of all the reservations
        passenger1.getReservations();
        System.out.println("\n");                                   // Blank space for visibility
        // Removing flight2 from the reservation
        passenger1.cancelFlight(flight2);
        // Output of all the reservations
        passenger1.getReservations();
    }
}
