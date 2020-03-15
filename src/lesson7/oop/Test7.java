package lesson7.oop;

public class Test7 {

    public static void main(String[] args) {
        Cat cat1 = new Cat ("Мартин", 4);
        Cat cat2 = new Cat ("Лионель",3);

        Plate plate = new Plate(5);
        plate.registerCat(cat1);
        plate.registerCat(cat2);
        plate.notifyAllCats();
        plate.addFood(10);
        plate.info();

    }
}
