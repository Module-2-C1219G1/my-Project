public class Square extends Shape implements Resizeable {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double getAre() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side = (this.side / 100) * percent;
    }
    @Override
    public void howToColor() {
        System.out.println("color four side");
    }
}
