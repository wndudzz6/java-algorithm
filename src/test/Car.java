package test;

public class Car extends Vehicle{
    private String name;
    public Car(String val){
        name = super.name = val;
    }

    @Override
    public String getName(String val) {
        return "Car name : "+val;
    }

    public String getName(byte[] val){
        return "Car name : "+val;
    }
}
