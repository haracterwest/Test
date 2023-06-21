package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array {
    public static void main(String[] args) {

        int max1 = -50, max2 = -50, max3;

        //НАЙТИ 3-е МАКСИМАЛЬНОЕ ЗНАЧЕНИЕ В МАССИВЕ


        //ОТСОРТИРОВАННЫЙ МАССИВ БЕЗ ПОВТОРОВ
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        max3 = arr1[arr1.length - 3];
        System.out.println("ОТСОРТИРОВАННЫЙ МАССИВ БЕЗ ПОВТОРОВ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("max3 = " + max3);
        System.out.println();


        //НЕОТСОРТИРОВАННЫЙ МАССИВ БЕЗ ПОВТОРОВ
//        int[] arr2 = {2, 22, 3, 33, -3, -2, 18, 4, 11, 18, 9, 3};
        int[] arr2 = {-15, -10, -22, -2, -7, -5, -11, -3};

        for (int j : arr2) {
            if (j > max1) {
                max2 = max1;
                max1 = j;
            } else if (j > max2) {
                max3 = max2;
                max2 = j;
            } else if (j > max3) {
                max3 = j;
            }
        }
        System.out.println("НЕОТСОРТИРОВАННЫЙ МАССИВ БЕЗ ПОВТОРОВ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("max1 = " + max1);
        System.out.println("max2 = " + max2);
        System.out.println("max3 = " + max3);
        System.out.println();


        //НЕОТСОРТИРОВАННЫЙ МАССИВ С ПОВТОРАМИ
        Integer [] arr3 = {10, 3, -7, 5, 3, 17, -11, 5, 12, 17, 10};
        Set<Integer> newSet = new LinkedHashSet<>();
        Collections.addAll(newSet, arr3);
        for (Integer i: newSet){
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max3 = max2;
                max2 = i;
            } else if (i > max3) {
                max3 = i;
            }
        }
        System.out.println("НЕОТСОРТИРОВАННЫЙ МАССИВ С ПОВТОРАМИ");
        System.out.println(Arrays.toString(arr3));
        System.out.println("max1 = " + max1);
        System.out.println("max2 = " + max2);
        System.out.println("max3 = " + max3);
        System.out.println();


        //СОРТИРОВКА ПУЗЫРЬКОМ НЕОТСОРТИРОВАННОГО МАССИВА БЕЗ ПОВТОРОВ
        Integer [] arr = {2, 22, 3, 33, -3, -2, 18, 4, 11, 9, 3};
        bubblesort2(arr);
        int m3 = arr[arr.length - 3];
        System.out.println("СОРТИРОВКА ПУЗЫРЬКОМ НЕОТСОРТИРОВАННОГО МАССИВА БЕЗ ПОВТОРОВ");
        System.out.println(Arrays.toString(arr));
        System.out.println("m3 = " + m3);
        System.out.println();


    }
    //МЕТОД СОРТИРОВКИ ПУЗЫРЬКОМ - ВАРИАНТ 1
    public static void bubblesort1 (Integer[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //МЕТОД СОРТИРОВКИ ПУЗЫРЬКОМ - ВАРИАНТ 2
    public static void bubblesort2 (Integer[] array) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
    }
}
