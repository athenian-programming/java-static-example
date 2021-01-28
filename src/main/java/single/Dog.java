package single;

import java.util.HashMap;
import java.util.Map;

public class Dog {
    static int dogCount = 0;
    static Map<String, Dog> dogMap = new HashMap<>();
    String breed;

    public Dog(String breed) {
        this.breed = breed;

        Dog.dogCount++;
        Dog.dogMap.put(breed, this);
    }

    public static void main(String[] args) {
        System.out.println("Breed count: " + Dog.dogCount);

        Dog poodle = new Dog("poodle");
        System.out.println("Breed count: " + Dog.dogCount);

        Dog pug = new Dog("pug");
        Dog beagle = new Dog("beagle");
        System.out.println("Breed count: " + Dog.dogCount);

        System.out.println("All dogs: " + Dog.dogMap);
    }

    @Override
    public String toString() {
        return "Dog{breed='" + breed + "'}";
    }
}
