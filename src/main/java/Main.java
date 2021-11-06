import animals.*;
import aviary.*;

public class Main {

    private static final AviaryLargeHerbivore aviaryLargeHerbivore = new AviaryLargeHerbivore();
    private static final AviarySmallHerbivore aviarySmallHerbivore = new AviarySmallHerbivore();
    private static final AviaryLargePredators aviaryLargePredators = new AviaryLargePredators();
    private static final AviarySmallPredators aviarySmallPredators = new AviarySmallPredators();

    public AnimalTypes getAviaryType() {
        return null;
    }

    public static void main(String[] args) {
        aviaryLargeHerbivore.addAnimal(new Elephant("Stepa"));
        aviaryLargeHerbivore.addAnimal(new Giraffe("Gena"));
        aviarySmallHerbivore.addAnimal(new Rabbit("Roger"));
        aviaryLargePredators.addAnimal(new Lion("Leva"));
        aviarySmallPredators.addAnimal(new Cat("Trump"));
        System.out.println("Печатаем то, что добавили");
        aviaryLargeHerbivore.printAnimals();   //вывод всех животных из большого вольера для травоядных
        aviarySmallHerbivore.printAnimals(); //вывод всех животных из маленького вольера для травояднвх
        aviaryLargePredators.printAnimals(); //вывод всех животных из большого вольера для хищников
        aviarySmallPredators.printAnimals(); //вывод всех животных из маленького вольера для хищников
        aviaryLargeHerbivore.removeAnimal("Gena"); //удаление животного по имени
        System.out.println("Проверяем удаление животного");
        //проверка вывода после удаления животного
        aviaryLargeHerbivore.printAnimals();
        aviarySmallHerbivore.printAnimals();
        aviaryLargePredators.printAnimals();
        aviarySmallPredators.printAnimals();
        System.out.println("Проверяем добавление животного не в свой вольер");
        aviarySmallPredators.addAnimal(new Buffalo("Serega"));
        

        // aviary.printAnimals();

        //Animal elephant = aviaryLargeHerbivore.getAnimal("Stepa");
        // System.out.println(elephant);
        // for (Animal animal : aviaryLargeHerbivore.getAnimals()) System.out.println(animal);

    }
}
