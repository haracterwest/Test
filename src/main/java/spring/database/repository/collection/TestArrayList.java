package spring.database.repository.collection;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        num.removeIf(d -> d % 2 == 0);
        num.forEach(s -> System.out.println(s + " "));

        System.out.println("_________________________________");

        Map<String, Integer> map = new HashMap<>();
        map.put("Tom", 200);
        map.put("Dim", 100);
        map.put("Ken", 150);
        map.put("Bob", 750);
        map.put("Luk", 360);
        map.forEach((a, b) -> System.out.println("Name: " + a + ", ЗП/месяц: " + b + "$"));

        System.out.println("_________________________________");

        List<Integer> numbers = Arrays.asList(4, 6, 5, 2, 3, 1);
        numbers.forEach(System.out::println);

        Collections.sort(numbers, ((o1, o2) -> o1.compareTo(o2)));
        numbers.forEach(System.out::println);

        System.out.println(numbers.stream().mapToInt(m -> m * 2).sum());
        System.out.println(numbers.stream().filter(n -> n % 2 != 0).mapToInt(m -> m * 2).sum());
    }
}
