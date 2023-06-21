package testConctruction;

public class Woman {
    private final String name;
    private final int age;
    private String husband;

    public Woman(String name, int age, String husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    public void setHusband(String husband) {
        this.husband = husband;
    }

    public String getHusband() {
        return husband;
    }

    @Override
    public String toString() {
        return name;
    }
}