package javaSE;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("введите числа");
        int a = scan.nextInt(), b = scan.nextInt();

        Operations plus = () -> a + b;
        Operations minus = () -> a - b;
        Operations multi = () -> a * b;
        Operations del = () -> a / b;


        System.out.println(plus.operation());
        System.out.println(minus.operation());
        System.out.println(multi.operation());
        System.out.println(del.operation());

        Fio fio = ((f, i, o) -> f + i + o);
        System.out.println(fio.build("Вишневский ", "Жан ", "Антонович"));
    }
}

@FunctionalInterface
interface Operations<T> {
    T operation();
}

@FunctionalInterface
interface  Fio {
    String build(String f, String i, String o);
}
