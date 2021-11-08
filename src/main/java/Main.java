import animals.*;
import aviary.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Aviary <Predator> forBigPredators = new Aviary<>(AnimalSizes.BIG, AnimalTypes.PREDATOR);
        Aviary <Predator> forSmallPredators = new Aviary<>(AnimalSizes.SMALL, AnimalTypes.PREDATOR);
        Aviary <Herbivore> forBigHerbivore = new Aviary<>(AnimalSizes.BIG, AnimalTypes.HERBIVORE);
        Aviary <Herbivore> forSmallHerbivore = new Aviary<>(AnimalSizes.SMALL, AnimalTypes.HERBIVORE);

        System.out.println("Добавляем маленьких травоядных");
        Thread.sleep(1500);
        forSmallHerbivore.addAnimal(new Rabbit("Roger"));
        System.out.println("Добавляем больших травоядных");
        Thread.sleep(1500);
        forBigHerbivore.addAnimal(new Giraffe("Stepa"));
        forBigHerbivore.addAnimal(new Elephant("Valera"));
        forBigHerbivore.addAnimal(new Buffalo("Viktor"));
        System.out.println("Проверяем вывод первых");
        Thread.sleep(1500);
        forSmallHerbivore.valuesAnimals();
        System.out.println("Проверяем вывод вторых");
        Thread.sleep(1500);
        forBigHerbivore.valuesAnimals();
        System.out.println("А теперь добавляем маленьких хищников и больших хищников");
        Thread.sleep(1500);
        forSmallPredators.addAnimal(new Cat("Trump"));
        forBigPredators.addAnimal(new Lion("Leva"));
        System.out.println("Проверям вывод первых");
        Thread.sleep(1500);
        forSmallPredators.valuesAnimals();
        System.out.println("Проверяем вывод вторых");
        Thread.sleep(1500);
        forBigPredators.valuesAnimals();
        System.out.println("Теперь удаляем Жирава из большого вольера для травоядных и проверяем, что его нет");
        Thread.sleep(1500);
        forBigHerbivore.removeAnimal("Stepa");
        forBigHerbivore.printAnimals();
        System.out.println("И в конце пытаемся добавлить животное не туда");
        Thread.sleep(1500);
       // forBigHerbivore.addAnimal(new Lion("Leva"));






    }
}
