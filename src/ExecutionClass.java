import inheritance.MountainBike;
import polymorphism.Shape;
import polymorphism.Vertices;
import singleton.Database;

public class ExecutionClass {
    public static void main(String[] args) {
        MountainBike m=new MountainBike();
        m.speed();
        m.pedal();
        m.tire();
        m.brake();
        Shape h= new Vertices();
        h.goals();
        Database db1;
        db1=Database.getInstance();
        db1.getConnection();


    }
}
