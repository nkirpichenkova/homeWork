package factory;

import animals.Animal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalTypeData;

public class AnimalFactory {
    public Animal create(AnimalTypeData animalType) {
        switch (animalType) {
            case CAT -> {
                return new Cat();
            }
            case DOG -> {
                return new Dog();
            }
            case DUCK -> {
                return new Duck();
            }
        }
        return null;
    }
}
