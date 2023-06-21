package testConctruction;

public class Man {
    private final String name;
    private int age;
    private String wife;

    public Man(String name, int age, String wife) {
        this.name = name;
        this.age = age;
        this.wife = wife;

    }

    public String getName() {
        return name;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public String getWife() {
        return wife;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
