package org.isep;

import org.isep.airlineManagment.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime time20241205T101215 = LocalDateTime.of(2024,12,05,10,12,15);
        LocalDateTime time20261205T101215 = LocalDateTime.of(2026,12,05,10,12,15);
        LocalDateTime time20241206T101215 = LocalDateTime.of(2024,12,06,10,12,15);
        LocalDateTime time20240205T152536 = LocalDateTime.of(2024,02,05,15,25,36);
        LocalDateTime time20250118T235925 = LocalDateTime.of(2025,01,18,23,59,25);
        LocalDateTime time20270718T142559 = LocalDateTime.of(2027,07,18,14,25,59);
        LocalDateTime time20270718T152559 = LocalDateTime.of(2027,07,18,15,25,59);

        Airport CDG = new Airport("CDG", "Paris", "");
        Airport LHR = new Airport("LHR", "London", "desc");

        Aircraft boeing747 = new Aircraft("ABC","Boeing 747",416);
        Aircraft airbusA380 = new Aircraft("DEF","Airbus A380",853);

        Passenger passenger1 = new Passenger(3000001, "Thomas", "yololo", "phone", "FR78AAAAAA");
        Passenger passenger2 = new Passenger(3000002, "Rémy", "yololo2", "phone2", "FR78BBBBBB");
        Passenger passenger3 = new Passenger(3000003, "Seb", "yololo3", "phone3", "FR78CCCCCC");

        AirlinePilot pilot1 = new AirlinePilot(1000001,"Florian","yes","mail",001,LocalDateTime.now(),"I can fly, trust me",5);
        AirlinePilot pilot2 = new AirlinePilot(1000002,"Sasha","yes2","mail2",002,LocalDateTime.now(),"What does this button do ?",2);
        AirlinePilot pilot3 = new AirlinePilot(1000003,"Marilou","yes3","mail3",003,LocalDateTime.now(),"I afraid of heights",1);

        StaffCabin crew1 = new StaffCabin(2000001,"name","no?","contact",4,LocalDateTime.now(),"Trust me");
        StaffCabin crew2 = new StaffCabin(2000002,"name2","no?2","contact2",5,LocalDateTime.now(),"I'm an engineer");
        StaffCabin crew3 = new StaffCabin(2000004,"name3","no?3","contact3",6,LocalDateTime.now(),"I think that this should go right here");

        Flight flight1 = new Flight(000001, CDG, LHR, time20241205T101215,time20261205T101215, "Currently Flying");
        Flight flight2 = new Flight(000002, CDG, LHR, time20241206T101215,time20250118T235925, "Currently Flying");
        Flight flight3 = new Flight(000003, CDG, LHR, time20240205T152536,time20241206T101215, "Currently Flying");
        Flight flight4 = new Flight(000004, CDG, LHR, time20241206T101215,time20270718T142559, "Currently Flying");
        Flight flight5 = new Flight(000005, CDG, LHR, time20270718T142559,time20270718T152559, "Currently Flying");
        Flight flight6 = new Flight(000006, CDG, LHR, time20270718T142559,time20270718T152559, "Currently Flying");

        System.out.println(boeing747.assignFlight(flight1));
        System.out.println(boeing747.assignFlight(flight2));
        System.out.println(boeing747.assignFlight(flight3));
        System.out.println(boeing747.assignFlight(flight4));
        System.out.println(boeing747.assignFlight(flight5));
        System.out.println(airbusA380.assignFlight(flight6));


    }
}