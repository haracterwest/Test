package arrays;

import java.util.Scanner;

public class Methods {
    public static String[] initializeArray() {

        Scanner scan = new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 0; i < 4; i++) {
            arr[i] = scan.nextLine();
        }
        return arr;
    }

    public static void printArray(String[] array) {
        for (int i = array.length; i > 0; i--) {
            System.out.println(array[i - 1]);
        }
    }
}
