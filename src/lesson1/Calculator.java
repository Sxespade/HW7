package lesson1;

public class Calculator {

    private final String name;

    public Calculator(String name) {
        this.name = name;
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int mul (int a, int b) {
        return a*b;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void quadratic (double a, double b, double c) {

       double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}
