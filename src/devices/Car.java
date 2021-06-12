package devices;

import com.lab1.Human;
import com.lab1.Saleable;

public class Car extends Device implements Saleable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.hasCar(this)){
            throw new Exception("Klient nie ma tego auta!");
        }
        if (buyer.getCash() < price){
            throw new Exception("Klient nie ma tyle szmalu");
        }
        buyer.setCar(this);
        seller.removeCar();
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("Sprzedano auto: " + this.producer + " " + this.model + ". Kupił " + buyer.name + " od " + seller.name + " za " + price + ".");
        System.out.println(seller.name + " ma teraz " + seller.getCash() + ", a " + buyer.name + " ma " + buyer.getCash() + ".");
        System.out.println(buyer.name + " ma auto: " + buyer.getCar().toString());
    }
}

