package org.isep.airlineManagment;

public class Person {
    protected int id;
    protected String name;
    protected String address;
    protected String contact;


    public Person(int id, String name, String address, String contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }


    public void getInfos() {
        System.out.println("Name : "+ this.name);
        System.out.println("ID : "+ this.id);
        System.out.println("Address : "+ this.address);
        System.out.println("Contact : "+ this.contact);
    }


    public int getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }


    public String getAddress() {
        return this.address;
    }


    public String getContact() {
        return this.contact;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public void setContact(String contact) {
        this.contact = contact;
    }
}
