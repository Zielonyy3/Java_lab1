package devices;

public class Car extends Device{
    public int vMax;
    public String color;
    public double price;

    public Car(Producer producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public boolean equals(Car car) {
        if (!this.model.equals(car.model)) {
            return false;
        }
        if (!this.producer.equals(car.producer)) {
            return false;
        }
        if (this.vMax != car.vMax) {
            return false;
        }
        if (this.color != null && !this.color.equals(car.color)) {
            return false;
        }
        return true;
    }

    public int hashCode()
    {
        int hash = 7;
        hash += this.model.hashCode();
        hash += this.producer.hashCode();
        hash +=  (this.color != null ? this.color.hashCode() : 0);
        return hash;
    }

    public String toString() {
        String tmpString = "Model " + this.model + "\n";
        tmpString += "Producent: " + this.producer + "\n";
        tmpString += "vMax: " + this.vMax + "\n";
        tmpString += "Kolor: " + this.color + "\n";

        return tmpString;
    }

    @Override
    public void turnOn(){
        System.out.println("*Dzwiek odpalania silnika*");
    }
}

