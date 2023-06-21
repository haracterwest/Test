package streams;

import java.util.stream.Stream;

public class Phone {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000), new Phone("Samsung Galaxy S 6", 40000));


//        phoneStream.forEach(s-> System.out.println(s.getName()));
//        phoneStream.map(f -> f.getName()).forEach(s -> System.out.println(s));

//        phoneStream.filter(s->s.getPrice() < 50000).forEach(s-> System.out.println(s.getName()));

        phoneStream.map(s -> "название: " + s.getName() + " цена: " + s.getPrice()).forEach(s -> System.out.println(s));

    }


}
