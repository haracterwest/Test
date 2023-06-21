package spring.database.repository.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

        /*
        СТРУКТУРА HashMap
        Создаётся по умолчанию массив из 16 элементов (корзин), внутри которых хранятся NOD
        NOD:
        final int - hashcode ключа
        final K key - ключ
        V value - значение
        NOD<K,V> next - ссылка

        Каждый элемент массива (корзины) - это связный список LinkedList,
                где по умолчанию ссылка next в NOD = null.

                hashcode ключа для Integer считается по формуле: int%16, т.е. находится остаток от деления на 16 (корзин)
                hashcode ключа для String считается сложнее, поэтому вероятность коллизии сильно меньше.

        При коллизии, когда в корзине hash-коды ключей по equals равны false, в LinkedList добавляется следующий NOD.
        При сравнении hash-кодов ключей по equals равны true, происходит перезапись значение
        При большом колличестве коллизий LinkedList O(n) может заменяться на сбалансированное дерево TreeMap log(n),
                скорость которого выше

        0[] 1[] 2[] 3[] 4[] 5[] 6[] 7[] 8[] 9[] 10[] 11[] 12[] 13[] 14[] 15[]
*/
        java.util.HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(17, "text17");  //корзина 1
        map1.put(19, "text19");  //корзина 3
        map1.put(6, "text6");   //корзина 6
        map1.put(4, "text4");   //корзина 4
        map1.put(35, "text35");   //корзина 3
        map1.put(19, "text1999");   //корзина 3

        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry);
        }


//        Map<String, Integer> map = new HashMap<>();
//        map.put("text1", 5);
//        map.put("text2", 5);
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry);
//        }
//
//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator.next();
//            System.out.println(entry);
//        }


    }
}
