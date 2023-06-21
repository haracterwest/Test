package generics;

public class Example2 <T> {

    private T instance;

    private Example2() {
    }

    public static <T> void simpleInit (T inst) {
    }

    public static <T> Example2 <T> init (T inst) {
        return new Example2<>();
    }

    public void set(T obj) {
        instance = obj;
    }

    public T get() {
        return instance;
    }
}
