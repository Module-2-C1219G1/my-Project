public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5, "Black");
        Circle cylinder1 = new Cylinder();
        Circle cylinder2 = new Cylinder(2);
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(cylinder1.toString());
        System.out.println(cylinder2.toString());
    }
}
