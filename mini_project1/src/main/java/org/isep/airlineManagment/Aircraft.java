package org.isep.airlineManagment;

public class Aircraft {
    private String registration;
    private String model;
    private int capacity;


    public Aircraft(String registration, String model, int capacity) {
        this.registration = registration;
        this.model = model;
        this.capacity = capacity;
    }


    public String getRegistration() {
        return this.registration;
    }


    public String getModel() {
        return this.model;
    }


    public int getCapacity() {
        return this.capacity;
    }


    public void setRegistration(String registration) {
        this.registration = registration;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
