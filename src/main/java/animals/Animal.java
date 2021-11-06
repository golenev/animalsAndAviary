package animals;

public abstract class Animal implements Aviaryable {

    private static int counter = 0;
    private String name;

    public static int getCounter() {
        return counter;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getId() {
        return name;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + this.name + ".";
    }
}
