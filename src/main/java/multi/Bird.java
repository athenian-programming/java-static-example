package multi;

public class Bird extends Animal {

    public Bird(String breed) {
        super(breed);
    }

    @Override
    public String getSound() {
        return "chirp";
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public String toString() {
        return "Bird" + super.toString();
    }
}
