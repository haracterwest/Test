package spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");


        Dog myDog = context.getBean("dogBean", Dog.class);

        myDog.say();
//        Dog yourDog = context.getBean("dogBean", Dog.class);
//
//        System.out.println("Переменные ссылаются на один объект? " + (myDog==yourDog));
//
//        System.out.println(myDog);
//        System.out.println(yourDog);

        context.close();
    }
}
