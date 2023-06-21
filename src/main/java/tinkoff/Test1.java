package tinkoff;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Введите чило: ");
        Scanner scNumb = new Scanner(System.in);
        int numb = scNumb.nextInt();
        int numb1 = scNumb.nextInt();
        if ((numb >= -32000 && numb <= 32000) && (numb1 >= -32000 && numb1 <= 32000)){
            System.out.println(numb + numb1);
        } else {
            System.out.println("Число должно быть в пределах -32000...32000");
        }
    }
}
