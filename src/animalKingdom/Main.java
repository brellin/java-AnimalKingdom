package animalKingdom;

import java.lang.invoke.LambdaConversionException;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;

interface Checker {
    boolean test(Animal animal);
}

public class Main {

    public static void printAnimal(ArrayList<Animal> animals, String sortName, boolean bool) {
        System.out.println("\n========= " + sortName + " =========\n");
        if (bool) {
            animals.forEach(animal -> System.out.println(animal.move()));
        } else {
            animals.forEach(animal -> System.out.println("Animal Name: " + animal.getName() + "\n" + "Year Discovered: "
                    + animal.getYearDiscovered() + "\n"));
        }
    }

    public static void animalFilter(ArrayList<Animal> animals, Checker check, String checkName) {
        System.out.println("\n========= " + checkName + " =========\n");
        for (Animal one : animals) {
            if (check.test(one)) {
                System.out.println(one.getName() + "\n" + one.move() + "\n" + one.breathe() + "\n" + one.reproduce()
                        + "\n" + one.getYearDiscovered() + "\n");
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<Animal>();

        // mammals
        animals.add(new Mammal("Panda", 1869));
        animals.add(new Mammal("Zebra", 1778));
        animals.add(new Mammal("Koala", 1816));
        animals.add(new Mammal("Sloth", 1804));
        animals.add(new Mammal("Armadillo", 1758));
        animals.add(new Mammal("Raccoon", 1758));
        animals.add(new Mammal("Bigfoot", 2021));

        // fish
        animals.add(new Fish("Salmon", 1758));
        animals.add(new Fish("Catfish", 1817));
        animals.add(new Fish("Perch", 1758));

        // birds
        animals.add(new Bird("Pidgeon", 1837));
        animals.add(new Bird("Peacock", 1821));
        animals.add(new Bird("Toucan", 1758));
        animals.add(new Bird("Parrot", 1824));
        animals.add(new Bird("Swan", 1758));

        printAnimal(animals, "Original", false);

        // Descending Year Discovered
        ArrayList<Animal> yearSort = new ArrayList<>(animals);
        yearSort.sort((one, two) -> two.getYearDiscovered() - one.getYearDiscovered());
        printAnimal(yearSort, "Descending Year Discovered", false);

        // Alphabetize
        ArrayList<Animal> nameSort = new ArrayList<>(animals);
        nameSort.sort((one, two) -> one.getName().compareTo(two.getName()));
        printAnimal(nameSort, "Alphabetized", false);

        // Sort by Movement Type
        ArrayList<Animal> moveSort = new ArrayList<>(animals);
        moveSort.sort((one, two) -> one.move().split(" ")[1].compareTo(two.move().split(" ")[1]));
        printAnimal(moveSort, "Sort By Movement", true);

        // Only those that breathe with lungs
        animalFilter(animals, animal -> animal.breathe().contains("lungs"), "Filter by Lungs");

        // Only those that breathe with lungs and discovered in 1758
        animalFilter(animals, animal -> animal.breathe().contains("lungs") && animal.getYearDiscovered() == 1758,
                "Filter by Lungs and Discovered in 1758");

        // Only those that lay eggs and breathe with lungs
        animalFilter(animals, animal -> animal.breathe().contains("lungs") && animal.reproduce().contains("eggs"),
                "Filter by Lungs and Lay Eggs");

        // Only those discovered in 1758
        animalFilter(animals, animal -> animal.getYearDiscovered() == 1758, "Only Discovered in 1758");

        // Only mammals
        animalFilter(animals, animal -> animal instanceof Mammal, "Is a Mammal (Stretch)");

    }

}
