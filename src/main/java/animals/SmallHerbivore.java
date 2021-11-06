package animals;

public class SmallHerbivore extends Animal{
    public SmallHerbivore(String name) {
        super(name);
    }

    @Override
    public AnimalTypes getAviaryType() {
        return AnimalTypes.SMALL_HERBIVORE;
    }
}
