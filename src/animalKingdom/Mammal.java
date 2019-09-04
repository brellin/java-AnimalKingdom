package animalKingdom;

public class Mammal extends Animal {

    public Mammal(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public String move(){
        return name + " walks.";
    }

    @Override
    public String breathe(){
        return name + " breathes using lungs.";
    }
    
    
    @Override
    public String reproduce(){
        return name + " gives live birth.";
    }

}
