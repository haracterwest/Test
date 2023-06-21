package javaSE;

public class NumberGeneratorF {

    public interface NumberGenerator<T extends Number> {
        boolean cond(T arg);
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return arg -> arg.intValue() > 0;
    }
}
