package javaSE;

public class LambdaApp {
    public static void main(String[] args) {
        Operationable operation;    //1. определение ссылки на функциональный интерфейс
        operation = (x, y) -> x + y;   //2. создание лямбда выражения, где параметры лямбда-выражения (x,y) соответствуют параметрам единственного метода интерфейса javaSE.Operationable

        Operationable operation1 = (x, y) -> x * y;

        int result = operation.calculate(10, 20);     //3. Использование лямбда-выражения в виде вызова метода интерфейса
        int resmulto = operation1.calculate(5, 15);
        System.out.println(result);
        System.out.println(resmulto);
    }
}

//функциональный интерфейс - представлен одним методом
interface Operationable {
    int calculate(int x, int y);    //метод с параметрами без реализации
}
