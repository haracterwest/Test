package generics;

import java.util.Arrays;

//создание методов по работе с массивом: добавление элемента, удаление, возврат
public class DynamicArray <T> {
    public static void main(String[] args) {
        DynamicArray <Integer> dynamicArray = new DynamicArray<>();

        System.out.println(dynamicArray);

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12);
        dynamicArray.add(13);

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.get(5));

        dynamicArray.remove(2);
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.get(5));


    }
    private int index;
    private T[] arr = (T[]) new Object[10];

    public DynamicArray() {
    }

    @Override
    public String toString() {
        return "index = " + index +
                ", arr=" + Arrays.toString(arr);
    }

    //метод: добавление элемента с увеличением массива
    public void add(T el) {
        if (index >= arr.length - 1) {  //проверка
            arr = Arrays.copyOf(arr, arr.length + 1);
        }
        arr[index++] = el;
    }

    //удаление элемента из массива
    public void remove(int index) {
        if ((arr.length - 1) > index) {   //убеждаемся, что длина массива не превышает index
            System.arraycopy(arr, index + 1, arr, index, (arr.length - 1) - index);
        }
        this.index--;
    }

    //извлечение элемента из массива
    public T get(int index) {
        if (index >= this.index) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }
}
