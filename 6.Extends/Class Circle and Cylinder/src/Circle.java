public class Circle {
    private double radius = 1;
    private String color = "black";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: [ Color - "
                +this.color+" radius - "
                +this.radius+" area - "
                + getArea()+"]";    }
}
