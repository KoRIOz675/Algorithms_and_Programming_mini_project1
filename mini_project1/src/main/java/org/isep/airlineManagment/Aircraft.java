package org.isep.airlineManagment;

import java.util.Random;

public class Aircraft {
    private String registration;
    private String model;
    private int capacity;


    public Aircraft(String registration, String model, int capacity) {
        this.registration = registration;
        this.model = model;
        this.capacity = capacity;
    }
}
