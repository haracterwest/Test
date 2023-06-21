package javaSE;

public class Test {

    public static void main(String[] args) {

        String data = null;
        if (data == null) {
            throw new ProductNotFoundException("Объект не найден");
        }
    }

}

/**
 * //Задача1.5.12 - Напишите метод printOddNumbers,
 * // который принимает массив и выводит в консоль только нечетные числа из него,
 * // через запятую. Конец вывода должен перевести курсор на новую строку.
 * //        int[] arr = {11, 2, 6, 8, 10, -3, 101, -5, 0, 31, 4, 5, 22, 12, 7, 17, 18, 22};
 * //
 * //        int index = 0;
 * //        for (int i = 0; i < arr.length; i++) {
 * //            if (arr[i] % 2 != 0) {
 * //                index++;
 * //            }
 * //        }
 * //        int[] fin = new int[index];
 * //        int tmp = 0;
 * //        for (int j = 0; j < arr.length; j++) {
 * //            if (arr[j] % 2 != 0) {
 * //                fin[tmp++] = arr[j];
 * //            }
 * //        }
 * //        for (int j = 0; j < fin.length; j++) {
 * //            System.out.print(fin[j]);
 * //            if (j + 1 != fin.length) {
 * //                System.out.print(",");
 * //            }
 * //        }
 * //        System.out.println();
 * //    }
 * //}
 * <p>
 * //Задача1.5.7 - Слить два произвольных массива в один отсортированный
 * int[] num1 = {11, 2, 31, 4, 5, 12, 7, 17};
 * int[] num2 = {-3, 9, 7, -2, 6};
 * <p>
 * int[] fin = new int[num1.length + num2.length];
 * int index = 0;
 * <p>
 * System.out.println(Arrays.toString(num1) + " Длина массива: " + num1.length);
 * System.out.println(Arrays.toString(num2) + " Длина массива: " + num2.length);
 * System.out.println(Arrays.toString(fin) + " Длина массива: " + fin.length);
 * <p>
 * for (int m = 0; m < num1.length; m++) {
 * fin[m] = num1[m];
 * index++;
 * }
 * <p>
 * System.out.println(Arrays.toString(fin));
 * <p>
 * for (int n = 0; n < num2.length; n++) {
 * fin[index++] = num2[n];
 * }
 * <p>
 * System.out.println(Arrays.toString(fin));
 * <p>
 * for (int i = 0; i < fin.length - 1; i++) {
 * for (int j = i + 1; j < fin.length; j++) {
 * System.out.println("j=" + j + " i=" + i + " " + Arrays.toString(fin));
 * if (fin[i] > fin[j]) {
 * int tmp = fin[i];
 * fin[i] = fin[j];
 * fin[j] = tmp;
 * }
 * }
 * }
 * }
 * }
 * System.out.println(Arrays.toString(fin));
 * <p>
 * <p>
 * Задача 1.5.6 - Развернуть массив
 * int[] res = new int[numbers.length];
 * <p>
 * for (int i = 0; i < numbers.length; i++) {
 * res[i] = numbers[numbers.length - i - 1];
 * }
 * System.out.println(Arrays.toString(res));
 * <p>
 * // Задача 1.5.5
 * <p>
 * int[] numb1 = new int[1]; //если кол-во элементов массива НЕЧЕТНОЕ
 * int[] numb2 = new int[2]; //если кол-во элементов массива ЧЕТНОЕ
 * if (numbers.length > 0) {
 * if (numbers.length % 2 == 0) {
 * numb2[0] = numbers[numbers.length / 2 - 1];
 * numb2[1] = numbers[numbers.length / 2];
 * System.out.println(Arrays.toString(numb2));
 * } else {
 * numb1[0] = numbers[(numbers.length - 1) / 2];
 * System.out.println(Arrays.toString(numb1));
 * }
 * }
 * <p>
 * // Задача 1.5.4
 * <p>
 * <p>
 * // найдем индекс первого элемента, который больше или равен start
 * int startIndex = 0;
 * while (startIndex < numbers.length && numbers[startIndex] < start) {
 * startIndex++;
 * }
 * System.out.println(startIndex);
 * <p>
 * // найдем индекс первого элемента, который больше end
 * int endIndex = startIndex;
 * while (endIndex < numbers.length && numbers[endIndex] <= end) {
 * endIndex++;
 * }
 * System.out.println(endIndex);
 * <p>
 * // найдем длину новго массива
 * int[] numb = new int[endIndex - startIndex];
 * System.out.println(numb.length);
 * <p>
 * System.out.println(Arrays.toString(Arrays.copyOfRange(numbers, startIndex, endIndex)));
 * <p>
 * <p>
 * int index = 0;
 * for (int j = 0; j < numbers.length; j++) {
 * if ((numbers[j] >= start) && (numbers[j] <= end)) {
 * numb[index++] = numbers[j];
 * }
 * }
 * System.out.println(Arrays.toString(numb));
 */