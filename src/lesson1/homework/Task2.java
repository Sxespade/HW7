package lesson1.homework;

public class Task2 {

    public static void main(String[] args) {
        byte a = 127;
        System.out.println(a);

        short b = Short.MAX_VALUE;
        System.out.println(b);

        int c = Integer.MIN_VALUE;
        Integer c1 = new Integer(2);

        System.out.println(c);

        long d = 1_000_000_000_000L;
        System.out.println(d);

        float e = (int)3.14;
        System.out.println(e);

        long f = Long.MAX_VALUE;
        System.out.println(f);

        char g = '@';
        System.out.println(g);

        boolean h = true;
        System.out.println(h);

        String str = "simple text";
        System.out.println(str);

        System.out.println(a + "\r" + b);

    }
}
