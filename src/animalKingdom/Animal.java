package animalKingdom;

public abstract class Animal {

    // fields
    public int baseId = 0;
    public int id;
    public String name;
    public int yearDiscovered;

    public Animal(String name, int yearDiscovered){
        baseId++;
        this.id = baseId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }
    
    // global method
    public String eat(String food){
        return name + " eats " + food + ".";
    }

    // methods
    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();
    
    @Override
    public String toString(){
        return "\nAnimal Name: " + name + "\n" +
        "Year Discovered: " + yearDiscovered;
    }

}
