package exception;

public class Except {
    public static void main(String[] args) {
        Except except = new Except();
        except.doSomething();
    }

    public void doSomething() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (Throwable e) {
            System.out.println("BlockCatch!");
        }
    }
}
