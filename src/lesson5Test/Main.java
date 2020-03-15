package lesson5Test;

import lesson1.Calculator;
import lesson5.Cat;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("");

        cat.setAge(777);

        System.out.println(cat);
        cat.setAge(10);
        System.out.println(cat);

//        Calculator calc = new Calculator("myCalc");
        Calculator.quadratic(4, 5, -6);
        Math.abs(-1);

        Random random = new Random();
    }
}
