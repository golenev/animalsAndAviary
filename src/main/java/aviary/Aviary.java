package aviary;

import animals.Animal;
import animals.AnimalTypes;
import animals.Aviaryable;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public abstract class Aviary implements Aviaryable {

    private Map<String, Animal> animals = new HashMap<>();
    public Animal getAnimal (String name){
        return animals.get(name);
    }

    public void addAnimal(Animal animal) {

        if(animal.getAviaryType() != this.getAviaryType()) throw new UnsupportedOperationException("Несовместимые животные!");
        String id = animal.getId();
        animals.put(id, animal);
    }

    public void removeAnimal(String id) {
        animals.remove(id);
    }
    public Collection<Animal> getAnimals(){
        return animals.values();
    }

    public void printAnimals() {
        System.out.println(animals.values());
        //for (String name : animals.keySet()) System.out.println(name);
    }


}


