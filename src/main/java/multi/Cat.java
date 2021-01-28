package multi;

public class Cat extends Animal {

    public Cat(String breed) {
        super(breed);
    }

    @Override
    public String getSound() {
        return "meow";
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}
