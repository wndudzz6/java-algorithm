package test;

public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Bicycle());
        t1.start();
        Thread t2 = new Thread(new Bicycle());
        t2.start();
    }
}
