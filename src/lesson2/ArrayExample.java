package lesson2;

import java.util.*;

public class ArrayExample {
    public static void main(String[] args) {

        final int SIZE = 5;

        int[][] data = new int[SIZE][SIZE]; // [0, 4]

//        data[-1] = 6;

//        Arrays.fill(data, 1);
//        data[2][1] = 5.0;
//        data[3][2] = 6.0;

        System.out.println(Arrays.toString(data));

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                data[i][j] = i + j;
        }


        for (int[] datum : data) {
            for (int v : datum) {
                System.out.print(v + "\t");
            }
            System.out.println();
        }

//        String str = new String("Hello world");
        char[] charArr = {'H', 'e', 'l', 'l', 'o'};
        String str = new String(charArr);
        System.out.println(str);

        for (char c : str.toCharArray()) {
            System.out.println(c);

        }

    }
}
