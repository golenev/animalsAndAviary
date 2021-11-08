package aviary;

import animals.Animal;
import animals.AnimalSizes;
import animals.AnimalTypes;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Aviary<T extends Animal> {
    private AnimalTypes type;
    private AnimalSizes size;

    public Aviary(AnimalSizes size, AnimalTypes type) {
        this.size = size;
        this.type = type;
    }

    private Map<String, T> animals = new HashMap<>();

    public T getAnimal(String name) {

        return animals.get(name);
    }

    public void addAnimal(T animal) {
        String id = animal.getId();
        animals.put(id, animal);
    }

    public void removeAnimal(String id) {
        animals.remove(id);
    }

    public Collection<T> getAnimals() {
        return animals.values();
    }

    public void printAnimals() {
        Collection<T> about = animals.values();
        System.out.println("Животные вольера приветствуют вас!");
        for (T animal : about) System.out.println(animal);
    }

    public void valuesAnimals() {
        System.out.println(animals.values());
    }
}


