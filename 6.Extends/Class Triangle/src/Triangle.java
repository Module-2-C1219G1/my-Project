public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
    }
    public Triangle(double side1,double side2,double side3,String color,boolean filled){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return this.side1 * this.side2 * this.side3;
    }

    public double getPerimeter() {
        double heron = 0.5*(this.side1+this.side2+this.side3);
        return Math.sqrt(heron*(heron-this.side1)*(heron - this.side2)*(heron - this.side3));
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle[" +
                "side1: " + this.side1 +
                ", side2: " + this.side2 +
                ", side3: " + this.side3 +
                ", Area: "+ getArea()+
                ", perimeter: "+getPerimeter()+
                ']'+"\n"+super.toString();
    }
}



