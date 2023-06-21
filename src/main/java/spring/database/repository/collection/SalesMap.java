package spring.database.repository.collection;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesMap {
    public static void main(String[] args) {

        ByteArrayInputStream bais = new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        getSalesMap(buffReader);

        System.out.println(buffReader);
    }

    public static Map<String, Long> getSalesMap(Reader reader) {

        Map<String, Long> map = new HashMap<>();
        Scanner scan = new Scanner(reader);

        while (scan.hasNext()) {
            String name = scan.next();
            Long value = scan.nextLong();
            map.merge(name, value, Long::sum);
        }
        return map;
    }
}
