package creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String name, int numberOfLegs){
        super(name, numberOfLegs, "farm animal");
    }

    @Override
    public String toString() {
        return "FarmAnimal: " + this.species;
    }

    @Override
    public void feed(double FoodWeight) {
        System.out.println("Muuu!");
        this.setWeight(this.getWeight()+ FoodWeight);
    }

    @Override
    public void beEaten() {
        this.setWeight(0.0);
        System.out.println("Zegnaj przyjacielu.");
    }
}
