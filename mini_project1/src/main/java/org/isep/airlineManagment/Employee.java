package org.isep.airlineManagment;

import java.util.Date;

public class Employee extends Person {
    int numberEmployee;
    Date hiringDate;

    public Employee(String name, String address, String contact, int numberEmployee, Date hiringDate) {
        super(name, address, contact);
        this.hiringDate = hiringDate;
        this.numberEmployee = numberEmployee;
    }

    public String getRole() {
        return "role";
    }

}
