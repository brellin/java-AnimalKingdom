package animalKingdom;

public class Bird extends Animal {

    public Bird(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return getName() + " flies.";
    }

    @Override
    public String breathe() {
        return getName() + " breathes using lungs.";
    }

    @Override
    public String reproduce() {
        return getName() + " produces eggs.";
    }

}
