package lesson1.homework;

public class Task3 {

    public static void main(String[] args) {
        double result = evaluateExpression(2,1, 2, 0);
//        System.out.println(result);
        testTern(5);
    }

    static double evaluateExpression(int a, int b, int c, int d) {


        return d != 0 ? a * (b + (1.0 * c / d)) : 0;
    }

    static void testTern (int a) {
//        if (a > 0) {
//            System.out.println("а больше нуля");
//        }
//        else  {
//            System.out.println("а меньше нуля");
//        }

        // (условие) ? (true) : (false)

        System.out.println((a > 0 ? "больше" : "меньше") + "!" );

    }
}
