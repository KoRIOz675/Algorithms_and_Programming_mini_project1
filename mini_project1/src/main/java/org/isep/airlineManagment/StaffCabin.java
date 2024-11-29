package org.isep.airlineManagment;

import java.util.Date;

public class StaffCabin extends Employee{

    private String qualification;

    public StaffCabin(String name, String address, String contact, int numberEmployee, Date hiringDate, String qualification) {
        super(name, address, contact, numberEmployee, hiringDate);
        this.qualification = qualification;
    }

    public void assignFlight(){
    }

    public void getFlight(){
    }
}
