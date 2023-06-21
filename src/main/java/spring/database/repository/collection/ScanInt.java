package spring.database.repository.collection;

import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ScanInt {
    public static void main(String[] args) {
        System.setIn(new ByteArrayInputStream("1 2 3 4 5 6 7 8 9 10".getBytes()));

        Scanner scan = new Scanner(System.in);
        Deque<Integer> pink = new ArrayDeque<>() {};

        while (scan.hasNextInt()) {
            scan.next();
            if (scan.hasNextInt()) {
                pink.addFirst(scan.nextInt());
            }
        }

        for (Integer num: pink) {
            System.out.print(num++);
        }
    }
}
