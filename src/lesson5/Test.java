package lesson5;

public class Test {

    public Test(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public Test(int a, int b) {
        this(a, b, 3);
    }

}
