package test;

class A {
    static {
        System.out.println("A static");
    }
    {
        System.out.println("A instance");
    }
    public A(){
        System.out.println("A constructor");
    }
}



