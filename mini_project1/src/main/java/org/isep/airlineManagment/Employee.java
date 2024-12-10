package org.isep.airlineManagment;

import java.time.LocalDateTime;

public abstract class Employee extends Person {
    protected int numberEmployee;
    protected String hiringDate;


    public Employee(int id, String name, String address, String contact, int numberEmployee, String hiringDate) {
        super(id, name, address, contact);
        this.hiringDate = hiringDate;
        this.numberEmployee = numberEmployee;
    }


    public String getRole() {
        // Determines the role of the employee based of the first number of the id (1 for pilot and 2 for crew)
        String temp = String.valueOf(String.valueOf(this.id).charAt(0));
        switch (temp) {
            case "1" :
                return "Role : Pilot";
            default:
                return "Role : Crew";
        }
    }


    public int getNumberEmployee() {
        return this.numberEmployee;
    }


    public String getHiringDate() {
        return this.hiringDate;
    }


    public void setNumberEmployee(int numberEmployee) {
        this.numberEmployee = numberEmployee;
    }


    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }
}
