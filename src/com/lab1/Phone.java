package com.lab1;

import java.util.Date;

public class Phone {
    private Date dateOfProduction;
    public int ramMemory;
    public double screenSize;
    public String brand;
    public String model;

    public Phone(String brand, String model, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        setDateOfProduction(new Date());
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }
}
