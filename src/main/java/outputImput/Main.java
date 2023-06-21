package outputImput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String bax = reader.readLine();
        String god = reader.readLine();

        System.out.println(name + " будет получать " + bax + " через " + god + " года");


//
//        int num = Integer.parseInt(reader.readLine());
//        System.out.println(num * 3);

//        int num1 = Integer.parseInt(reader.readLine());
//        int num2 = Integer.parseInt(reader.readLine());
//
//        System.out.println(sum(num1, num2));

//        InputStreamReader streamReader = new InputStreamReader(System.in);
//        System.out.println((char) streamReader.read());

//        while (true) {
//            int data = System.in.read();
//            System.out.print((char) data);
//        }
    }

    private static int sum(int number1, int number2){
        int res = number1 + number2;
        return res;
    }

}
