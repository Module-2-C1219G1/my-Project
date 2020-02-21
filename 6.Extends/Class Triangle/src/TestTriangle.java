public class TestTriangle {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape triangle = new Triangle(5,6,7,"Pink",false);
        System.out.println(shape.toString()+"\n"+"\n"+triangle);
    }
}
