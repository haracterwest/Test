package javaSE;

import java.util.Objects;

public class User {

//    private String name;
    private int age;
    private int salary;


    public User(){
    }

    public User(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age && salary == user.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, salary);
    }
}
