package abstraction;

public class AutomaticCar extends manual{

    public void automaticCar(){
        System.out.println("this car is automaticCar");
    }

     public void gas(){
         System.out.println("this car run with gas");
     }
    @Override
    public void manual() {
        System.out.println("the car is manual");
    }
}
