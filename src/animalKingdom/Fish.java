package animalKingdom;

public class Fish extends Animal {

    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return getName() + " swims.";
    }

    @Override
    public String breathe() {
        return getName() + " breathes using gills.";
    }

    @Override
    public String reproduce() {
        return getName() + " produces eggs.";
    }

}
