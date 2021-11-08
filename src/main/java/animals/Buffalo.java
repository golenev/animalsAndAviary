package animals;

public class Buffalo extends Herbivore {

    @Override
    public String toString() {
        return super.toString() + "Я буйвол";
    }

    public Buffalo(String name) {
        super(name);
    }
}
