package lesson3;


import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
/*        String str1 = "Java"; // 001 [010]
        String str2 = "Java"; // 002 [010]
        String str3 = new String("Java"); // 003 [011]
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str3: " + (str1.equals(str3)));
        str1 += "1"; //001 [111]*/

/*        var a = 1.4;
        double b = 45.3;

        System.out.println(getX(a, b));

        int a1 = 4345345;
        int b2 = 453475345;

        System.out.println(getX(a, b));

        getX();

        System.out.println(getX(3, 2, 1, 6));*/

/*        int[] data = new int[5];

        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(99) + 1; // [1 100]
            data[i] = random.nextInt(10); // [0 10]
            data[i] = random.nextInt(13) + 32; //[32 45]
//            data[i] = Math.random(); //[0; 1)
            data[i] = (int)(Math.random() * 100 +1); //[1; 99)

        }

//        System.out.println(Arrays.toString(data));*/

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = reader.readLine();
//        System.out.println("Line from console: "+line);

        Scanner scanner = new Scanner(System.in);
        int str = scanner.hasNextInt() ? scanner.nextInt() : 0;
        System.out.printf("\n Line from console: %d! We are happy", str);
    }

    static double getX(int a, int... other) {
        int sum = 0;
        for (int i : other) {
            sum += i;
        }
        return 1.0 * sum / a * 100;
    }

    static double getX(double a, double b) {

        return 1.0 * a / b * 100;
    }

    static void getX() {
        System.out.println("Вы не ввели аргументы");
    }
}
