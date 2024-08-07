import animals.Animal;
import data.AnimalTypeData;
import data.ColorData;
import data.CommandsData;
import factory.AnimalFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            //вывод команд из enum
            System.out.println("Введите команду:" + Arrays.toString(CommandsData.values()).toLowerCase());
            //сохранение ввода пользователя
            String userCommand = scanner.nextLine().trim().toUpperCase();

            //проверка существования команды
            try {
                Enum.valueOf(CommandsData.class, userCommand);
            } catch (IllegalArgumentException e) {
                System.out.println("Вы ввели неверную команду. Введите её повторно&");
                continue;
            }

            switch (userCommand) {
                case "ADD" -> {
                   AnimalFactory animalFactory = new AnimalFactory();
                   System.out.println("Выберите животное: " + Arrays.toString(AnimalTypeData.values()));
                   String userAnimalType = scanner.nextLine().trim();

                   //проверка корретности значения
                   while(!AnimalTypeData.isCorrectType(userAnimalType)) {
                       System.out.println("Вы ввели неверный вид животного. Повторите ввод \n" +
                               "Выберите животное: " + Arrays.toString(AnimalTypeData.values()));
                       userAnimalType = scanner.nextLine().trim();
                   }

                   //поиск типа животного в enum и создание животного
                    String typeOfAnimal = AnimalTypeData.findTypeAnimal(userAnimalType);
                    Animal userAnimal = animalFactory.create(AnimalTypeData.valueOf(typeOfAnimal));

                    //ввод имени
                    System.out.println("Введите имя животного: ");
                    String animalName = scanner.nextLine().trim();
                    userAnimal.setName(animalName);

                    //ввод возраста
                    System.out.println("Введите возраст животного в целых годах: ");

                    //проверка: возраст является целым числом
                    while (true) {
                        String userAgeAnimal = scanner.nextLine().trim();
                        try {
                            int ageAnimal = Integer.parseInt(userAgeAnimal);
                            if (ageAnimal > 0) {
                                userAnimal.setAge(ageAnimal);
                            } else {
                                System.out.println("Вы ввели отрицательное значение, либо равное 0. Пожалуйста, повторите ввод: ");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Введенный возраст не является целым числом. Пожалуйста, повторите ввод: ");
                        }
                    }


                    //ввод веса
                    System.out.println("Введите вес животного в целых кг: ");

                    //проверка: вес является целым числом
                    while (true) {
                        String userWeightAnimal = scanner.nextLine().trim();
                        try {
                            int weightAnimal = Integer.parseInt(userWeightAnimal);
                            if (weightAnimal > 0) {
                                userAnimal.setWeight(weightAnimal);
                            } else {
                                System.out.println("Вы ввели отрицательное значение, либо равное 0. Пожалуйста, повторите ввод: ");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Введенный вес не является целым числом. Пожалуйста, повторите ввод: ");
                        }
                    }

                    //ввод цвета
                    System.out.println("Введите цвет животного: " + Arrays.toString(ColorData.values()));
                    String userColorType = scanner.nextLine().trim();

                    //проверка корретности значения
                    while(!ColorData.isCorrectColor(userColorType)) {
                        System.out.println("Вы ввели неверный цвет животного. Повторите ввод \n" +
                                "Выберите цвет: " + Arrays.toString(ColorData.values()));
                        userColorType = scanner.nextLine().trim();
                    }

                    //поиск введенного значения в enum ColorData
                    ColorData colorOfAnimal = ColorData.findColorAnimal(userColorType);
                    userAnimal.setColor(colorOfAnimal);

                    animals.add(userAnimal);
                }
                case "LIST" -> {
                    for(Animal animal: animals) {
                        System.out.println(animal.toString());
                    }
                }
                case "EXIT" -> {
                    System.exit(0);
                }
            }
        }
    }
}