package lesson1.homework;

public class Task7 {

    public static void main(String[] args) {
        greeting("GeekBrains");
    }

    private static void greeting(String name) {
        String helloName = name.equals("Timofei") ? "Привет, повелитель":"Hello, " + name + "!";
        System.out.println(helloName);
    }

}
