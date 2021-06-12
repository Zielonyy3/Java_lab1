package devices;

public abstract class Device {
    public final Producer producer;
    public final Integer yearOfProduction;
    public final String model;

    public Device(Producer producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.model = model;
    }

    public abstract void turnOn();

    public String toString() {
        String tmpString = "Producent " + this.producer + "\n";
        tmpString += "Rok produkcji: " + this.yearOfProduction + "\n";
        tmpString += "Model: " + this.model + "\n";

        return tmpString;
    }
}
