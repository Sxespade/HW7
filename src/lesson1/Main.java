package lesson1;

public class Main {

    public static void main(String[] args) {

        // jvm jre jdk
        //тестируем типы данных
        // Р. Мартина - Чистый код
        int a = 7;
        int b = 5;
        double c = a / b;
        System.out.println(c);
       char chr = 10000;
        System.out.print("Результат: " + c);

/**        char chr;
        for (int i=0; i< 3000; i++)
        System.out.printf("%4d: %2c ", i, i);*/

        boolean iFlag = false;
        System.out.println(iFlag);

        String str2 = new String("Hello, world!");
        String str = "Hello, world!";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

//        System.out.println(add(2, 4));

        Calculator calc = new Calculator("Тестовый");
//        System.out.println(calc.mul(3,7789));


        int valA = 7;
        int valB = 5;
        System.out.println(valA % valB);
        System.out.println(valA); //7
        System.out.println(valA++); //7
        System.out.println(++valA); //9
        System.out.println(--valA);  //8
        System.out.println(valA--); //8
        System.out.println(valA); //7

        valA += valB;
        valA *= 2; //valA = valA * 2
        System.out.println(valA);

        String hw = new String("hw!");
//        if (calc.mul(3,4) == 14) {
        if (hw.equals("hw!")) {
            System.out.println("Правда!");
        }
        else {
            System.out.println("Ложь!");
        }
    }

    public static int add(int a, int b) {

        return (a + b)*2;
    }

}
