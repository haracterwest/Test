package functionInt;

import java.util.function.*;

public class FunInt<T, U> {
    public static void main(String[] args) {
//        Predicate<Object> condition = Objects::isNull;
//        Function<Object, Integer> ifTrue = obj -> 0;
//        Function<CharSequence, Integer> ifFalse = CharSequence::length;
//        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
//
//        System.out.println(safeStringLength);
//    }
//
//    public static <T, U> FunInt<T, U> ternaryOperator(
//            Predicate<? super T> condition,
//            FunInt<? super T, ? extends U> ifTrue,
//            FunInt<? super T, ? extends U> ifFalse) {
//        return t -> (condition.test(t)) ? ifTrue.apply(t) : ifFalse.apply(t);

        //PREDICATE
        Predicate<Integer> isZero = value1 -> value1 ==0;
        System.out.println(isZero.test(0));
        System.out.println(isZero.test(4));

        //CONSUMER
        Consumer<String> print = string -> System.out.println(string);
        print.accept("Hello!");

        //FUNCTION
        Function<Integer, Double> convert = value -> Double.valueOf(value);
        System.out.println(convert.apply(10));

        //SUPPLIER
//        Supplier<String> text = () -> {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter text...");
//            return scanner.nextLine();
//        };
//        System.out.println(text.get());

        //UnaryOperator
        UnaryOperator<Double> kor = value -> Math.sqrt(value);
        System.out.println(kor.apply(16.0));

        //BinaryOperator
        BinaryOperator<Double> pow = (value1, value2) -> Math.pow(value1, value2);
        System.out.println(pow.apply(2.0, 4.0));
    }


}
