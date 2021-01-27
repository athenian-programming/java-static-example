package multi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animal count: " + Animal.animalCount);

        Cat siamese = new Cat("siamese");
        Bird hawk = new Bird("hawk");
        System.out.println("Animal count: " + Animal.animalCount);

        System.out.println("All animals: " + Animal.animalList);
    }
}
