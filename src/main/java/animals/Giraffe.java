package animals;

public class Giraffe extends Herbivore {
    @Override
    public String toString() {
        return super.toString() + " Я жираф.";
    }

    public Giraffe(String name) {
        super(name);
    }
}
