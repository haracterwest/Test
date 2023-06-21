package testConctruction;

public class Human {
    private String name;
    private boolean sex;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSex() {
        return sex ? "мужской" : "женский";
    }


    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }


    public void setFather(Human father) {
        this.father = father;
    }


    public Human getMother() {
        return mother;
    }


    public void setMother(Human mother) {
        this.mother = mother;
    }


    @Override
    public String toString() {
        String objFather;
        String objMother;

        if (father != null) {
            objFather = father.name;
        } else {
            objFather = "";
        }

        if (mother != null) {
            objMother = mother.name;
        } else {
            objMother = "";
        }

        return "Имя: " + name +
                ", пол: " + getSex() +
                ", возраст: " + age +
                ", отец: " + objFather +
                ", мать: " + objMother;
    }
}
