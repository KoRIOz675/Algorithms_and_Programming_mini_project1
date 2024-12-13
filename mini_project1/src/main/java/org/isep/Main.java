// MAFILLE Thomas - 62303
// MAILLARD Rémy - 62304

package org.isep;

import org.isep.airlineManagment.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Menu
        // Scanner scanner;
        int userChoice1;
        int userChoice2;
        int userChoice3;
        String userChoice4;
        boolean flag = true;
        ArrayList<LocalDateTime> dates = new ArrayList<LocalDateTime>();
        ArrayList<Airport> airports = new ArrayList<Airport>();
        ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>();
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        ArrayList<AirlinePilot> pilots = new ArrayList<AirlinePilot>();
        ArrayList<StaffCabin> staffCabins = new ArrayList<StaffCabin>();
        ArrayList<Flight> flights = new ArrayList<Flight>();
        LocalDateTime date;
        Airport airport;
        Aircraft aircraft;
        Passenger passenger;
        AirlinePilot pilot;
        StaffCabin staffCabin;
        Flight flight;
        String filePath = "src/main/resources/";


        try {
            FileReader aircraftReader = new FileReader(filePath+"aircraft.csv");
            BufferedReader aircraftBufferedReader = new BufferedReader(aircraftReader);

            String line;
            String[] text;

            while ((line = aircraftBufferedReader.readLine()) != null) {
                text = line.split(";");
                aircrafts.add(new Aircraft(text[0], text[1], Integer.parseInt(text[2])));
            }
            aircraftBufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            System.out.println("Input/Output exception");;
        }


        try {
            FileReader airportReader = new FileReader(filePath+"airport.csv");
            BufferedReader airportBufferedReader = new BufferedReader(airportReader);

            String line;
            String[] text;

            while ((line = airportBufferedReader.readLine()) != null) {
                text = line.split(";");
                airports.add(new Airport(text[0], text[1], text[2]));
            }
            airportBufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            System.out.println("Input/Output exception");;
        }


        try {
            FileReader crewReader = new FileReader(filePath+"crew.csv");
            BufferedReader crewBufferedReader = new BufferedReader(crewReader);

            String line;
            String[] text;

            while ((line = crewBufferedReader.readLine()) != null) {
                text = line.split(";");
                staffCabins.add(new StaffCabin(Integer.parseInt(text[0]), text[1], text[2], text[3], Integer.parseInt(text[4]),text[5], LocalDateTime.of(Integer.parseInt(text[6]), Integer.parseInt(text[7]), Integer.parseInt(text[8]), 0,0,0)));
            }
            crewBufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            System.out.println("Input/Output exception");;
        }


        try {
            FileReader passengerReader = new FileReader(filePath+"passenger.csv");
            BufferedReader passengerBufferedReader = new BufferedReader(passengerReader);

            String line;
            String[] text;

            while ((line = passengerBufferedReader.readLine()) != null) {
                text = line.split(";");
                try {
                    passengers.add(new Passenger(Integer.parseInt(text[0]),text[1],text[2],text[3],text[4]));
                } catch (Exception e) {
                    text[0] = text[0].substring(1);
                    passengers.add(new Passenger(Integer.parseInt(text[0]),text[1],text[2],text[3],text[4]));
                }
            }
            passengerBufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            System.out.println("Input/Output exception");;
        }


        try {
            FileReader pilotReader = new FileReader(filePath+"pilots.csv");
            BufferedReader pilotBufferedReader = new BufferedReader(pilotReader);

            String line;
            String[] text;

            while ((line = pilotBufferedReader.readLine()) != null) {
                text = line.split(";");
                pilots.add(new AirlinePilot(Integer.parseInt(text[0]), text[1], text[2], text[3], Integer.parseInt(text[4]),text[5], Integer.parseInt(text[6]), LocalDateTime.of(Integer.parseInt(text[7]), Integer.parseInt(text[8]), Integer.parseInt(text[9]), 0,0,0)));
            }
            pilotBufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            System.out.println("Input/Output exception");;
        }


        try {
            FileReader timeTableReader = new FileReader(filePath+"timetable.csv");
            BufferedReader timeTableBufferedReader = new BufferedReader(timeTableReader);

            String line;
            String[] text;

            while ((line = timeTableBufferedReader.readLine()) != null) {
                text = line.split(";");
                dates.add(LocalDateTime.of(Integer.parseInt(text[0]),Integer.parseInt(text[1]),Integer.parseInt(text[2]),Integer.parseInt(text[3]),Integer.parseInt(text[4]),0));
            }
            timeTableBufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            System.out.println("Input/Output exception");;
        }

        
        do {
            System.out.println("");
            userChoice1 = getInt("Choose a function. Enter the corresponding number : \n0.\tQuit\n1.\tDate\n2.\tAirport\n3.\tAircraft\n4.\tPassenger\n5.\tPilot\n6.\tStaff Cabin\n7.\tFlight", 0);
            switch (userChoice1) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("");
                    userChoice2 = getInt("Choose a function. Enter the corresponding number : \n0.\tBack\n1.\tView a list of all Dates\n2.\tAdd a new Date\n3.\tChange an existing Date\n4.\tRemove a Date", 0);
                    switch (userChoice2) {
                        case 0:
                            break;
                        case 1:
                            int i = 0;
                            for (LocalDateTime d : dates) {
                                System.out.println(i + " : " + d);
                                i++;
                            }
                            if (i == 0) {
                                System.out.println("You currently have no Dates");
                            }
                            break;
                        case 2:
                            date = LocalDateTime.of(getInt("Enter a year", 0), getInt("Enter a month", 0), getInt("Enter a day", 0), getInt("Enter an hour", 0), getInt("Enter a minute", 0), getInt("Enter a second", 0));
                            dates.add(date);
                            break;
                        case 3:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the date to modify", -1);
                            System.out.println("You are modifying the following date : ");
                            System.out.println(dates.get(userChoice3));
                            date = LocalDateTime.of(getInt("Enter a year", 0), getInt("Enter a month", 0), getInt("Enter an hour", 0), getInt("Enter a minute", 0), getInt("Enter a minute", 0), getInt("Enter a second", 0));
                            dates.set(userChoice3, date);
                            break;
                        case 4:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the date to delete", -1);
                            dates.remove(userChoice3);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("");
                    userChoice2 = getInt("Choose a function. Enter the corresponding number : \n0.\tBack\n1.\tView a list of all Airports\n2.\tAdd a new Airport\n3.\tChange an existing Airport\n4.\tRemove an Airport", 0);
                    switch (userChoice2) {
                        case 0:
                            break;
                        case 1:
                            int i = 0;
                            for (Airport a : airports) {
                                System.out.println(i + " : " + a);
                                i++;
                            }
                            if (i == 0) {
                                System.out.println("You currently have no Airports");
                            }
                            break;
                        case 2:
                            airport = new Airport(getString("Enter a name"), getString("Enter a city"), getString("Enter a description"));
                            airports.add(airport);
                            break;
                        case 3:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the airport to modify", -1);
                            System.out.println("You are modifying the following airport : ");
                            System.out.println(airports.get(userChoice3));
                            airport = new Airport(getString("Enter a name"), getString("Enter a city"), getString("Enter a description"));
                            airports.set(userChoice3, airport);
                            break;
                        case 4:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the airport to delete", -1);
                            airports.remove(userChoice3);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("");
                    userChoice2 = getInt("Choose a function. Enter the corresponding number : \n0.\tBack\n1.\tView a list of all Aircrafts\n2.\tAdd a new Aircraft\n3.\tChange an existing Aircraft\n4.\tRemove an Aircraft", 0);
                    switch (userChoice2) {
                        case 0:
                            break;
                        case 1:
                            int i = 0;
                            for (Aircraft a : aircrafts) {
                                System.out.println(i + " : " + a);
                                i++;
                            }
                            if (i == 0) {
                                System.out.println("You currently have no Aircrafts");
                            }
                            break;
                        case 2:
                            aircraft = new Aircraft(getString("Enter a registration"), getString("Enter a model"), getInt("Enter a capacity", -1));
                            aircrafts.add(aircraft);
                            break;
                        case 3:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the aircraft to modify", -1);
                            System.out.println("You are modifying the following aircraft : ");
                            System.out.println(aircrafts.get(userChoice3));
                            aircraft = new Aircraft(getString("Enter a registration"), getString("Enter a model"), getInt("Enter a capacity", -1));
                            aircrafts.set(userChoice3, aircraft);
                            break;
                        case 4:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the aircraft to delete", -1);
                            aircrafts.remove(userChoice3);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("");
                    userChoice2 = getInt("Choose a function. Enter the corresponding number : \n0.\tBack\n1.\tView a list of all Passengers\n2.\tAdd a new Passenger\n3.\tChange an existing Passenger\n4.\tRemove an Passenger", 0);
                    switch (userChoice2) {
                        case 0:
                            break;
                        case 1:
                            int i = 0;
                            for (Passenger p : passengers) {
                                System.out.println(i + " : " + p);
                                i++;
                            }
                            if (i == 0) {
                                System.out.println("You currently have no Passengers");
                            }
                            break;
                        case 2:
                            passenger = new Passenger(getInt("Enter an ID", -1), getString("Enter a name"), getString("Enter an address"), getString("Enter a contact"), getString("Enter a passport"));
                            passengers.add(passenger);
                            break;
                        case 3:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the passenger to modify", -1);
                            System.out.println("You are modifying the following passenger : ");
                            System.out.println(passengers.get(userChoice3));
                            passenger = new Passenger(getInt("Enter an ID", -1), getString("Enter a name"), getString("Enter an address"), getString("Enter a contact"), getString("Enter a passport"));
                            passengers.set(userChoice3, passenger);
                            break;
                        case 4:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the passenger to delete", -1);
                            passengers.remove(userChoice3);
                            break;
                    }
                    break;
                case 5:
                    System.out.println("");
                    userChoice2 = getInt("Choose a function. Enter the corresponding number : \n0.\tBack\n1.\tView a list of all Pilots\n2.\tAdd a new Pilot\n3.\tChange an existing Pilot\n4.\tRemove an Pilot", 0);
                    switch (userChoice2) {
                        case 0:
                            break;
                        case 1:
                            int i = 0;
                            for (AirlinePilot p : pilots) {
                                System.out.println(i + " : " + p);
                                i++;
                            }
                            if (i == 0) {
                                System.out.println("You currently have no Pilots");
                            }
                            break;
                        case 2:
                            pilot = new AirlinePilot(getInt("Enter an ID", -1), getString("Enter a name"), getString("Enter an address"), getString("Enter a contact"), getInt("Enter an employee ID", -1), getString("Enter a license"), getInt("Enter a number of flight hours", 0), dates.get(getInt("Enter the index of the hiring date", -1)));
                            pilots.add(pilot);
                            break;
                        case 3:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the pilot to modify", -1);
                            System.out.println("You are modifying the following pilot : ");
                            System.out.println(pilots.get(userChoice3));
                            pilot = new AirlinePilot(getInt("Enter an ID", -1), getString("Enter a name"), getString("Enter an address"), getString("Enter a contact"), getInt("Enter an employee ID", -1), getString("Enter a license"), getInt("Enter a number of flight hours", 0), dates.get(getInt("Enter the index of the hiring date", -1)));
                            pilots.set(userChoice3, pilot);
                            break;
                        case 4:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the pilot to delete", -1);
                            pilots.remove(userChoice3);
                            break;
                    }
                    break;
                case 6:
                    System.out.println("");
                    userChoice2 = getInt("Choose a function. Enter the corresponding number : \n0.\tBack\n1.\tView a list of all Staffs Cabin\n2.\tAdd a new Staff Cabin\n3.\tChange an existing Staff Cabin\n4.\tRemove an Staff Cabin", 0);
                    switch (userChoice2) {
                        case 0:
                            break;
                        case 1:
                            int i = 0;
                            for (StaffCabin s : staffCabins) {
                                System.out.println(i + " : " + s);
                                i++;
                            }
                            if (i == 0) {
                                System.out.println("You currently have no Staffs Cabin");
                            }
                            break;
                        case 2:
                            staffCabin = new StaffCabin(getInt("Enter an ID", -1), getString("Enter a name"), getString("Enter an address"), getString("Enter a contact"), getInt("Enter an employee ID", -1), getString("Enter the qualifications"),  dates.get(getInt("Enter the index of the hiring date", -1)));
                            staffCabins.add(staffCabin);
                            break;
                        case 3:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the Staff Cabin to modify", -1);
                            System.out.println("You are modifying the following Staff Cabin : ");
                            System.out.println(staffCabins.get(userChoice3));
                            staffCabin = new StaffCabin(getInt("Enter an ID", -1), getString("Enter a name"), getString("Enter an address"), getString("Enter a contact"), getInt("Enter an employee ID", -1), getString("Enter the qualifications"),  dates.get(getInt("Enter the index of the hiring date", -1)));
                            staffCabins.set(userChoice3, staffCabin);
                            break;
                        case 4:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the Staff Cabin to delete", -1);
                            staffCabins.remove(userChoice3);
                            break;
                    }
                    break;
                case 7:
                    System.out.println("");
                    userChoice2 = getInt("Choose a function. Enter the corresponding number : \n0.\tBack\n1.\tView a list of all Flights\n2.\tAdd a new Flight\n3.\tChange an existing Flight\n4.\tRemove an Flight", 0);
                    switch (userChoice2) {
                        case 0:
                            break;
                        case 1:
                            int i = 0;
                            for (Flight f : flights) {
                                System.out.println(i + " : " + f);
                                i++;
                            }
                            if (i == 0) {
                                System.out.println("You currently have no Flights");
                            }
                            break;
                        case 2:
                            flight = new Flight(getInt("Enter an flight number", -1), airports.get(getInt("Enter the index of the origin Airport", -1)), airports.get(getInt("Enter the index of the destination Airport", -1)), dates.get(getInt("Enter the index of the departure date", -1)), dates.get(getInt("Enter the index of the arrival date", -1)), getString("Enter a status"));
                            flights.add(flight);
                            break;
                        case 3:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the Flight to modify", -1);
                            System.out.println("You are modifying the following Flight : ");
                            System.out.println(flights.get(userChoice3));
                            flight = new Flight(getInt("Enter an flight number", -1), airports.get(getInt("Enter the index of the origin Airport", -1)), airports.get(getInt("Enter the index of the destination Airport", -1)), dates.get(getInt("Enter the index of the departure date", -1)), dates.get(getInt("Enter the index of the arrival date", -1)), getString("Enter a status"));
                            flights.set(userChoice3, flight);
                            break;
                        case 4:
                            System.out.println("");
                            userChoice3 = getInt("Enter the index of the Flight to delete", -1);
                            flights.remove(userChoice3);
                            break;
                    }
                    break;
            }
        } while (flag);
    }


    public static int getInt(String message, int threshold) {
        Scanner scanner;
        int userChoice;
        do {
            scanner = new Scanner(System.in);
            System.out.println(message);
            try {
                userChoice = scanner.nextInt();
            } catch (Exception e) {
                // if user entered anything else but an integer
                userChoice = -1;
            }
        } while (userChoice < threshold);
        return userChoice;
    }


    public static String getString(String message) {
        Scanner scanner;
        String userChoice;
        scanner = new Scanner(System.in);
        System.out.println(message);
        userChoice = scanner.nextLine();
        return userChoice;
    }
}
