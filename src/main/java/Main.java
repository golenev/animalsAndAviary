import animals.*;
import aviary.*;

public class Main {

    public static void main(String[] args) {

        Aviary forBigHerbivore = new Aviary(AnimalSizes.BIG, AnimalTypes.HERBIVORE);
        Aviary forSmallPredators = new Aviary(AnimalSizes.SMALL, AnimalTypes.PREDATOR);

        System.out.println("Добавляем больших травоядных");
        forBigHerbivore.addAnimal(new Giraffe("Stepa"));
        forBigHerbivore.addAnimal(new Elephant("Valera"));
        forBigHerbivore.addAnimal(new Buffalo("Viktor"));
        forBigHerbivore.printAnimals();
        System.out.println("Добавляем маленьких хищников");
        forSmallPredators.addAnimal(new Cat("Trump"));
        System.out.println("Выводим Value");
        forSmallPredators.valuesAnimals();
        System.out.println("Удаляем животное из большого вольера для травоядных, проверяем вывод");
        forBigHerbivore.removeAnimal("Stepa");
        forBigHerbivore.printAnimals();
        System.out.println("Добавляем животное не в тот вольер");
        forSmallPredators.addAnimal(new Rabbit("Roger"));




    }
}
