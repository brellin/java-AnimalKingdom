package animalKingdom;

public abstract class Animal {

    // fields
    public int baseId = 0;
    private int id;
    private String name;
    private int yearDiscovered;

    public Animal(String name, int yearDiscovered) {
        baseId++;
        this.id = baseId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    // global methods
    public String eat(String food) {
        return name + " eats " + food + ".";
    }

    // getters
    public String getName() {
        return name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public int getId() {
        return id;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYearDiscovered(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    // abstract methods
    public abstract String move();

    public abstract String breathe();

    public abstract String reproduce();

    @Override
    public String toString() {
        return "\nAnimal Name: " + getName() + "\n" + "Year Discovered: " + getYearDiscovered();
    }

}
