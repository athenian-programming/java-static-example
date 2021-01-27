package single;

import java.util.HashMap;
import java.util.Map;

public class Dog {
    static int breedCount = 0;
    static Map<String, Dog> breedMap = new HashMap<>();
    String breed;

    public Dog(String breed) {
        this.breed = breed;

        Dog.breedCount++;
        Dog.breedMap.put(breed, this);
    }

    public static void main(String[] args) {
        System.out.println("Breed count: " + Dog.breedCount);

        Dog poodle = new Dog("poodle");
        System.out.println("Breed count: " + Dog.breedCount);

        Dog pug = new Dog("pug");
        Dog beagle = new Dog("beagle");
        System.out.println("Breed count: " + Dog.breedCount);

        System.out.println("All dogs: " + Dog.breedMap);
    }

    @Override
    public String toString() {
        return "Dog{breed='" + breed + "'}";
    }
}
