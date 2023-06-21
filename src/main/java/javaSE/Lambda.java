package javaSE;

public class Lambda {
    public static void main(String[] args) {

        Operation operationplus = ((x, y) -> x+y);
        Operation operationminus = ((x, y) -> x-y);

        System.out.println(operationplus.calculate(10, 20));
        System.out.println(operationminus.calculate(10, 20));

//        javaSE.Fio fio = (f, i, o) -> f+i+o;
//        System.out.println(fio.build("Вишневский ", "Жан ", "Антонович"));
//        System.out.println(fio.build("Вишневская ", "Анастасия ", "Сергеевна"));
    }
}
interface Operation {
    int calculate (int x, int y);
}

//interface javaSE.Fio {
//    String build (String f, String i, String o);
//}
