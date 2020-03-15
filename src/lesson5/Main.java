package lesson5;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Мартин", "Черный", 1);
        Cat cat2 = new Cat("Мартелл");
//        Cat cat3 = new Cat();

//        Cat.age = 22;

        Cat cat4 = cat;
        cat4.name = "Мартин Лютер Кинг";

        cat.meow();
        cat2.meow();

        Cat cat5 = cat.cloneCat("Барсик");
        Cat cat6 = cat2.cloneCat("Мурзик");

        Cat[] cats = new Cat[] {cat, cat2, cat4, cat5, cat6};
        for (Cat cat1 : cats) {
            cat1.meow();
        }


/*        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(cat5);
        System.out.println(cat6);
        System.out.println("Возрат нашего кота: " + cat.age);*/
    }
}
