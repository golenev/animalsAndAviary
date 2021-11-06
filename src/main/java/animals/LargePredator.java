package animals;

public class LargePredator extends Animal{
    public LargePredator(String name) {
        super(name);
    }

    @Override
    public AnimalTypes getAviaryType() {
        return AnimalTypes.LARGE_PREDATOR;
    }
}
