package multi;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    static int animalCount = 0;
    static List<Animal> animalList = new ArrayList<>();
    String breed;

    protected Animal(String breed) {
        this.breed = breed;

        Animal.animalCount++;
        Animal.animalList.add(this);
    }

    public abstract String getSound();

    public abstract boolean canFly();

    public String toString() {
        return "{breed='" + breed + "' sound='" + getSound() + "' flies=" + canFly() + "'}";
    }
}