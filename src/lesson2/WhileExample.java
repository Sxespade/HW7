package lesson2;

public class WhileExample {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
        if (i >= 10) {
            break;
        }
            System.out.println("WHILE "+i);
            i++;
        }

        do {
            System.out.println("DO ... WHILE");
        } while (false);
    }
}
