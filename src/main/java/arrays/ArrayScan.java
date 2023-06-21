package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        int[] arr2 = Arrays.copyOf(arr1, 5);
        int[] arr3 = Arrays.copyOfRange(arr1, 5, arr1.length);

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
