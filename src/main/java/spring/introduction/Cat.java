package spring.introduction;

//@Component("catBean")
public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat bean is created");
    }

    public void say() {
        System.out.println("Meow-Meow");
    }
}
