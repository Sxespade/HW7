package lesson2;

public class ForExample {
    public static void main(String[] args) {

        final int LIMIT = 20;
        final int STOP_DIGIT = 7;


/*        for ( int i = 0; i < LIMIT; i++ ) {
            System.out.println(i);
        }*/
        int i = 0;
        for (; i < LIMIT; i++) {
            if (i == STOP_DIGIT) {
                break;
            }
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println(i);
    }
}
