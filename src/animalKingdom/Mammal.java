package animalKingdom;

public class Mammal extends Animal {

    public Mammal(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return getName() + " walks.";
    }

    @Override
    public String breathe() {
        return getName() + " breathes using lungs.";
    }

    @Override
    public String reproduce() {
        return getName() + " gives live birth.";
    }

}
