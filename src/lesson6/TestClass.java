package lesson6;

import lesson1.Calculator;
import lesson5.User;

public class TestClass {

    public static void main(String[] args) {

//        Cat cat = new Cat("Мартин", "Черный", 1, 6);
        Dog dog = new Dog("Гендальф", "Серый", 4, 1);
//        Animal animal = new Animal();

        Animal cat = new Cat("Мартин", "Черный", 1, 6);


        dog.changeColor("Белый");

        Object[] animals = new Object[] {cat, dog, new User(12, "sww", "programmer", 33)};

        printVoices(cat, dog);

/*        dog.printInfo(true);
        cat.printInfo();*/
    }

    private static void printVoices(Animal... animals) {
        for (Animal animal : animals) {
            animal.voice();
        }


    }

    private static void printVoices(Object... animals) {
        for (Object animal : animals) {
            animal.toString();
        }
    }

}

