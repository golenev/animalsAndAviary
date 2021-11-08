package animals;

public class Lion extends Predator {

    @Override
    public String toString() {
        return super.toString() + " Я лев";
    }

    public Lion(String name) {
        super(name);
    }
}
