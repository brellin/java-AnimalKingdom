package animalKingdom;

import java.util.*;

public class Main {

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

        System.out.println("\n========= Original ===========\n" + animals + "\n\n==============================\n");

        // Descending Year Discovered
        Collections.sort(animals, (first, second) -> second.yearDiscovered - first.yearDiscovered);
        System.out.println("\n========== Descending Year Discovered ==========\n" + animals
                + "\n\n================================================\n");

        // Alphabetize
        Collections.sort(animals, (first, second) -> first.name.compareToIgnoreCase(second.name));
        System.out.println(
                "\n========== Alphabetical ==========\n" + animals + "\n\n==================================\n");

        // Sort by Movement Type
        System.out.println("\n========== Sort by Movement ==========\n");
        Collections.sort(animals, (first, second) -> first.move().split(" ")[1].compareTo(second.move().split(" ")[1]));
        animals.forEach(Animal -> System.out.println(Animal.move()));
        System.out.println("\n======================================\n");

        // Only those that breathe with lungs
        System.out.println("\n========== Filter by Lungs ==========\n");
        animals.forEach(animal -> {
            if (animal.breathe().contains("lungs")) {
                System.out.println(animal.breathe());
            }
        });
        System.out.println("\n=====================================\n");

        // Only those that breathe with lungs and discovered in 1758
        System.out.println("\n========== Filter by Lungs and Year Discovered ==========\n");
        animals.forEach(animal -> {
            if (animal.breathe().contains("lungs") && animal.yearDiscovered == 1758) {
                System.out.println("[" + animal.breathe() + "\nYear Discovered: " + animal.yearDiscovered + "]\n");
            }
        });
        System.out.println("\n=========================================================\n");

        // Only those that lay eggs and breathe with lungs
        System.out.println("\n========== Filter by Lungs and Lay Eggs ==========\n");
        animals.forEach(animal -> {
            if (animal.breathe().contains("lungs") && animal.reproduce().contains("eggs")) {
                System.out.println(animal.breathe() + "\n" + animal.reproduce() + "\n");
            }
        });
        System.out.println("\n==================================================\n");

        // Only those discovered in 1758
        System.out.println("\n========== Discovered in 1758 ==========\n");
        Collections.sort(animals, (first, second) -> first.name.compareTo(second.name));
        animals.forEach(animal -> {
            if (animal.yearDiscovered == 1758) {
                System.out.println("The " + animal.name + " was discovered in " + animal.yearDiscovered + ".");
            }
        });
        System.out.println("\n========================================\n");

        // Only mammals
        System.out.println("\n========== Only Mammals (Stretch) ==========\n");
        animals.forEach(animal -> {
            if (animal instanceof Mammal) {
                System.out.println(animal);
            }
        });
        System.out.println("\n============================================\n");

    }

}
