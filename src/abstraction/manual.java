package abstraction;

public abstract class manual implements Car {
    public abstract void manual();

    public void gear(){
        System.out.println("the car has 5gear");
    }


    @Override
    public void turnOnCar() {
        System.out.println("my car is on");
    }

    @Override
    public void turnOffCar() {
        System.out.println("my car is off");

    }
}
