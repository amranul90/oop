package polymorphism;

public class Shape {
    public void area( String Circle){
        System.out.println("circle");
    }
    public void area(String circle,String Triangle){
        System.out.println("circle triangle");
    }
    public void area(String Circle,String triangle,int number){
        System.out.println("circle triangle number 1");

    }
    public void goals(){
        System.out.println(" eating protein");
    }
}
