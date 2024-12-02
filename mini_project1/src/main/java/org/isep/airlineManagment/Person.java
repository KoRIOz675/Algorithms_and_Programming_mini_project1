package org.isep.airlineManagment;

public abstract class Person {
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


    public abstract void getInfos();


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
