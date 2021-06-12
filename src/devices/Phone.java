package devices;

import java.util.Date;

public class Phone extends Device{
    public int ramMemory;
    public double screenSize;
    public String model;

    public Phone(Producer producer, String model, Integer yearOfProduction, double screenSize) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
    }


    public String toString() {
        String tmpString = "RAM " + this.ramMemory + "\n";
        tmpString += "Rozmiar ekranu: " + this.screenSize + "\n";
        tmpString += "Model: " + this.model + "\n";

        return tmpString;
    }

    @Override
    public void turnOn(){
        System.out.println("*Bzddrym*");
    }
}
