package test;

class Bicycle implements Runnable {
    int a;
    public void run() {
        try{
            while (++a<100) {
                System.out.println("miles taveled : "+a);
                Thread.sleep(100);
            }
        }catch(Exception E) {}
    }
}

