package generics;



public class Test {
    public static void main(String[] args) {


        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        System.out.println(i + ", " + s);
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);

    }

//        Example1<javaSE.User> example1 = new Example1<>();
//        System.out.println(example1.getInstance());
//
//        example1.setInstance(new javaSE.User("Neo", 25));
//        System.out.println(example1.getInstance());
//
//
//        Example2.simpleInit(new javaSE.User());
//        Example2<javaSE.User> example2 = Example2.init(new javaSE.User());
//
//        example2.set(new javaSE.User("Tom", 21));
//
//
//        Example2.init("init");
//        Example2.simpleInit(new javaSE.User("Alex", 30));
//
//        List<BaseObject> listBaseObj = new ArrayList<>();
//        List<javaSE.User> listUser = new ArrayList<>();
//        List<ChildObject> listChObj = new ArrayList<>();
//
//        exampleSimple(listBaseObj);
//        exampleSimple(listUser);
//        exampleSimple(listChObj);
//
//        exampleExtends(listBaseObj);
//        exampleExtends(listUser);
//        exampleExtends(listChObj);
//
//        exampleSuper(listBaseObj);
//        exampleSuper(listUser);
//        exampleSuper(listChObj);
//    }
//
//    private static void exampleSimple(List<?> list) {
//    }
//
//    private static void exampleExtends(List<? extends javaSE.User> list) {
//    }
//
//    private static void exampleSuper(List<? super javaSE.User> list) {
//    }
}
