package animals;

public class Cat extends SmallPredator{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " Я кот";
    }
}

