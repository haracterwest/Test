package javaSE;

public class Constructor {

    public static void main(String[] args) {

        Line line = new Line();
        line.metod();

    }
}

class Properties {
    protected final String stud;


    public Properties(String stud) {
        this.stud = stud;
    }


    public Properties() {
        this.stud = "Прохожу тестовое задание.";
    }


    public void metod() {
        System.out.println("Я очень занят. " + stud);
    }
}

class Line extends Properties {

    Line() {
        super("Прохожу курс по Java.");
    }
}
