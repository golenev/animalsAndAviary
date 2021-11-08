package animals;

public class Cat extends Predator {

    @Override
    public String toString() {

        return super.toString() + " Я кот";
    }

    public Cat(String name) {

        super(name);
    }


}

