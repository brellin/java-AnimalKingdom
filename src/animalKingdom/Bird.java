package animalKingdom;

public class Bird extends Animal {

    public Bird(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public String move(){
        return name + " flies.";
    }

    @Override
    public String breathe(){
        return name + " breathes using lungs.";
    }
    
    
    @Override
    public String reproduce(){
        return name + " produces eggs.";
    }

}
