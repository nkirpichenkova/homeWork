package animals;

import data.ColorData;

public abstract class Animal {
    private String name = "";
    private int age = -1;
    private int weight = -1;
    private ColorData color = null;

    //getter and setter для полей

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ColorData getColor() {
        return color;
    }

    public void setColor(ColorData color) {
        this.color = color;
    }

    //методы для вывода действий

    public abstract void say ();

    void go() {
            System.out.println("Я иду");

    }

    void drink () {
        System.out.println("Я пью");
    }

    void eat () {
        System.out.println("Я ем");
    }

    //метод определния склонения возраста
    private String whatDeclension() {
    int remainder = age % 10;

    if (age>=11 && age<=14) {
            return "лет";
        }
    if (remainder == 1) {
        return "год";
    }
    if (remainder >=2 && remainder<= 4) {
        return "года";
    }
    return "лет";
    }

    //переопределение метода toString
    public String toString () {
        return "Привет! Меня зовут " + name + ", мне " + age + " " + whatDeclension() + ", я вешу " + weight + " кг, мой цвет - " + color;
    }

}
