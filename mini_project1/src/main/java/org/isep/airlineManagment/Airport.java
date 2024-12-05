package org.isep.airlineManagment;

public class Airport {
    private String name;
    private String city;
    private String description;


    public Airport(String name, String city, String description) {
        this.name = name;
        this.city = city;
        this.description = description;
    }


    public String getName() {
        return this.name;
    }


    public String getCity() {
        return this.city;
    }


    public String getDescription() {
        return this.description;
    }


    public void getName(String name) {
        this.name = name;
    }


    public void getCity(String city) {
        this.city = city;
    }


    public void getDescription(String description) {
        this.description = description;
    }
}
