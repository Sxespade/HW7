package lesson3;

import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            printIf();
            switch (in.next()) {
                case "1": colorRed(); break;
                case "2": colorCyan(); break;
                case "3": colorYellow(); break;
                case "4": colorBlue(); break;
                case "0": doExit(in);
                default:
                    System.out.println("Попробуйте еще раз");
            }
        }
    }

    private static void doExit(Scanner in) {
        System.out.println("Вы уверены??? y/n");
        if (in.next().equals("y")) {
            System.exit(0);
        }
    }

    public static void printIf() {
        System.out.println("\nВыберите цвет терминала:");
        System.out.println("1. Красный");
        System.out.println("2. Бирюзовый");
        System.out.println("3. Желтый");
        System.out.println("4. Синий");
        System.out.println("0. Выход");

    }

    public static void colorRed() {
        System.out.println("\u001B[31m");
    }
    public static void colorCyan() {
        System.out.println("\u001B[36m");
    }
    public static void colorYellow() {
        System.out.println("\u001B[33m");
    }
    public static void colorBlue() {
        System.out.println("\u001B[34m");
    }
}
