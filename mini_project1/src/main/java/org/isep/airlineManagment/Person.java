package org.isep.airlineManagment;

import java.util.Random;

public class Person {
    protected int id;
    protected String name;
    protected String address;
    protected String contact;

    public Person(String name, String address, String contact){
        Random random = new Random();
        this.id = random.nextInt(999999);
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public void getInfos(){
        System.out.println("Name : "+ name);
        System.out.println("ID : "+ id);
        System.out.println("Address : "+ address);
        System.out.println("Contact : "+ contact);
    }
}
