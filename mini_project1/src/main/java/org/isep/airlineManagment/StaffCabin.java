package org.isep.airlineManagment;

import java.time.LocalDateTime;

public abstract class StaffCabin extends Employee {
    private String qualification;


    public StaffCabin(int id, String name, String address, String contact, int numberEmployee, LocalDateTime hiringDate, String qualification) {
        super(id, name, address, contact, numberEmployee, hiringDate);
        this.qualification = qualification;
    }


    public void assignFlight() {
    }


    public void getFlight() {
    }


    @Override
    public void getInfos() {
        {
            System.out.println("Name : "+ this.name);
            System.out.println("ID : "+ this.id);
            System.out.println("Address : "+ this.address);
            System.out.println("Contact : "+ this.contact);
            System.out.println("Qualification : "+ this.qualification);
        }
    }


    public String getQualification() {
        return this.qualification;
    }


    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
