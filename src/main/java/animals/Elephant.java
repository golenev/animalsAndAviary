package animals;

public class Elephant extends LargeHerbivore{
    public Elephant(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " Я слон.";
    }
}
