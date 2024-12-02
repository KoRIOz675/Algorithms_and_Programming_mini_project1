package org.isep.airlineManagment;

import java.time.LocalDateTime;

public class StaffCabin extends Employee {
    private String qualification;


    public StaffCabin(int id, String name, String address, String contact, int numberEmployee, LocalDateTime hiringDate, String qualification) {
        super(id, name, address, contact, numberEmployee, hiringDate);
        this.qualification = qualification;
    }


    public void assignFlight() {
    }


    public void getFlight() {
    }


    public String getQualification() {
        return this.qualification;
    }


    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
