package animalKingdom;

import java.util.ArrayList;

public class Main {

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

        System.out.println("\n========= Original ===========\n\n" + animals);

        // Descending Year Discovered
        animals.sort((one, two) -> one.getYearDiscovered() - two.getYearDiscovered());
        System.out.println("\n========== Descending Year Discovered ==========\n\n" + animals);

        // Alphabetize
        animals.sort((one, two) -> one.getName().compareTo(two.getName()));
        System.out.println("\n========== Alphabetical ==========\n" + animals);

        // Sort by Movement Type
        animals.sort((one, two) -> one.breathe().compareTo(two.breathe()));
        System.out.println("\n========== Sort by Movement ==========\n\n");
        animals.forEach(Animal -> System.out.println(Animal.move()));

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
