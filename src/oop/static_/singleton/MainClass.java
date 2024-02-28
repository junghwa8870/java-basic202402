package oop.static_.singleton;

public class MainClass {

    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            Singleton s = Singleton.getInstance();
//        Singleton s = new Singleton();
            s.method1();
            s.method2();
            System.out.println("s = " + s);
        }

    }
}
