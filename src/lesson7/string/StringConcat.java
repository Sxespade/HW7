package lesson7.string;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StringConcat {

    public static void main(String[] args) throws IOException {
        String a1 = "Hello My ";
        String a2 = "Dear World";
        String a3 = a1 + a2;
        System.out.println(a3);

        String b1 = "Число 10: ";
        int b2 = 10;
        String b3 = b1 + b2;
        //String b3 = b1 + String.valueOf(b2);
//        String b3 = b1 + cat.toString();
        System.out.println(b3);

        String c1 = "Home";
        String c2 = "[" + c1 + "] = " + 1;
        System.out.println(c2);

        for (String s : a3.split(" ")) {
            System.out.println(s);
        }

        System.out.println(a3.trim());

        String sss1 = "abc";
        String sss2 = "Abc";
        System.out.println(sss1.compareTo(sss2));

        String str1 = "";
//        System.out.println(str1.isEmpty()); //null
        System.out.println(str1.isBlank()); // ""

        System.out.println("------");

        FileInputStream is = new FileInputStream("X:\\Lessons\\Java1\\src\\lesson7\\string\\text.txt");

/*        String str = new String(is.readAllBytes());
        System.out.println(str);*/

        int n;
//        StringBuffer
        StringBuilder sb = new StringBuilder();
        while (((n = is.read()) != -1)) {
            sb.append((char)n).append("!") ;
        }
        System.out.println(sb);

    }

}
