package animalKingdom;

public class Fish extends Animal {

    public Fish(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public String move(){
        return name + " swims.";
    }

    @Override
    public String breathe(){
        return name + " breathes using gills.";
    }
    
    
    @Override
    public String reproduce(){
        return name + " produces eggs.";
    }

}
