package animals;

public class Elephant extends Herbivore {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public String toString() {

        return super.toString() + " Я слон.";
    }
}
