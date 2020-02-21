import java.util.concurrent.CyclicBarrier;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder(){

    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height){
        this.height = height;
        setColor(color);
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return this.height * super.getArea();
    }

    @Override
    public String toString() {
        return super.toString()+" Height - "+this.height;
    }
}
