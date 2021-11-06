package animals;

public class LargeHerbivore extends Animal{
    public LargeHerbivore(String name) {
        super(name);
    }

    @Override
    public AnimalTypes getAviaryType() {
        return AnimalTypes.LARGE_HERBIVORE;
    }
}
