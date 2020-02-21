import java.util.Random;

public class TestResize {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(5, 3);
        Square square = new Square(4);
        Shape[] myShape = {circle, rectangle, square};
        Random random = new Random();
        for (Shape shape:myShape) {
            shape.resize(random.nextInt(101));
            System.out.println(shape.toString());
            shape.howToColor();
            System.out.println("--------------------------");
        }

    }
}
