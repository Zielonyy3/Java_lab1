package creatures;

public class Pet extends Animal {
    public Pet(String name, int numberOfLegs, String species) {
        super(name, numberOfLegs, species);
    }

    public Pet(String name, int numberOfLegs) {
        super(name, numberOfLegs, "pet");
    }

    public Pet(String name) {
        super(name, 4, "pet");
    }

    public Pet(String name, String species) {
        super(name, 4, species);
    }
}
