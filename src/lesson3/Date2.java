package lesson3;

import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {

    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        long time = date.getTime();

        for (; time < date.getTime() + 5; time++) {
            System.out.println("Еще не пришло время");
            Thread.sleep(1000);
        }

        System.out.println("ЧАС ПРОБИЛ!");
//        System.out.println(time);

        date.setTime(435435435234234L);
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        System.out.println("Текущая дата: " + format.format(date.getTime()));
    }
}
