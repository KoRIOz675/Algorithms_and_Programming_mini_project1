package org.isep.airlineManagment;

import java.time.LocalDateTime;

public class StaffCabin extends Employee {

    private String qualification;

    public StaffCabin(String name, String address, String contact, int numberEmployee, LocalDateTime hiringDate, String qualification) {
        super(name, address, contact, numberEmployee, hiringDate);
        this.qualification = qualification;
    }

    public void assignFlight() {
    }

    public void getFlight() {
    }
}
