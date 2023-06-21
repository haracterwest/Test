package spring.database.repository.collection;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<I extends Number> {

    public static void main(String[] args) {

        Set<Integer> list1 = new HashSet<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        Set<Integer> list2 = new HashSet<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        System.out.println(list2);


        System.out.println(symmetricDifference(list1,list2));

    }


    // метод, вычисляющий симметрическую разность двух множеств
    // removeAll(Collection c) — удаляет элементы, принадлежащие переданной коллекции - вычитает одну коллекцию из другой
    // retainAll(Collection c) — удаляет элементы, не принадлежащие переданной коллекции, возвращает общие элементы из двух массивов
    public static <T> Set <T> symmetricDifference(Set <? extends T> set1, Set <? extends T> set2) {
        Set <T> resSet1 = new HashSet<T>(set1);
        resSet1.removeAll(set2);
        Set <T> resSet2 = new HashSet<T>(set2);
        resSet2.removeAll(set1);
        resSet1.addAll(resSet2);
        return resSet1;
    }
}
