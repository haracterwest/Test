package spring.introduction;

//@Component("dogBean")
public class Dog implements Pet {

//    private String name;
    public Dog() {
        System.out.println("Dog bean is created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

//    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }

//    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
        }
        }
