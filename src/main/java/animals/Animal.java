package animals;

public class Animal {

    private static int counter = 0;
    private String name;
    private AnimalTypes type;
    private AnimalSizes size;

    public static int getCounter() {
        return counter;
    }

   /* public String getName() {
        return name;
    }*/

    public AnimalTypes getType() {
        return type;
    }

    public AnimalSizes getSize() {
        return size;
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
