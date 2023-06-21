package generics;

public class Example1 <T> {
    private T instance;

    public T getInstance() {
        return instance;
    }

    public void setInstance(T obj) {
        instance = obj;
    }
}
