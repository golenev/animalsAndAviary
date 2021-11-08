package animals;

public class Rabbit extends Herbivore {
    @Override
    public String toString() {
        return super.toString() + " Я кролик";
    }

    public Rabbit(String name) {
        super(name);
    }
}
