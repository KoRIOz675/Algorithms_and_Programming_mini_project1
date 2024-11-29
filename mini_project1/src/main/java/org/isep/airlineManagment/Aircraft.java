package org.isep.airlineManagment;

import java.util.Random;

public class Aircraft {
    private int registration;
    private String model;
    private int capacity;


    public Aircraft(String model, int capacity) {
        Random random = new Random();
        this.registration = random.nextInt(999999);
        this.model = model;
        this.capacity = capacity;
    }
}
