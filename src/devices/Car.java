package devices;

public class Car {
    public final String model;
    public final String producer;
    public int vMax;
    public String color;
    public CarBrands brand;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
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
        if (this.brand != null && !this.brand.equals(car.brand)) {
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
        hash +=  (this.brand != null ? this.brand.hashCode() : 0);
        return hash;
    }

    public String toString() {
        String tmpString = "Model " + this.model + "\n";
        tmpString += "Producent: " + this.producer + "\n";
        tmpString += "vMax: " + this.vMax + "\n";
        tmpString += "Kolor: " + this.color + "\n";
        tmpString += "Marka: " + this.brand.toString() + "\n";

        return tmpString;
    }
}

