package animals;

public class SmallPredator extends Animal{
    public SmallPredator(String name) {
        super(name);
    }

    @Override
    public AnimalTypes getAviaryType() {
        return AnimalTypes.SMALL_PREDATOR;
    }
}
