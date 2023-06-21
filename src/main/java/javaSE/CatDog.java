package javaSE;

public class CatDog {
    public static void main(String[] args) {

        Cat.sayHello();
        Dog.sayHello();
        Cat catchcat = new Cat();
        Dog.catchCat(catchcat);
    }

    public static class Cat {
        public static void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public static void sayHello() {
            System.out.println("Гав!");
        }

        public static void catchCat(Cat Cat) {
            System.out.println("Кошка поймана");
            sayHello();
            Cat.sayHello();
        }
    }
}
