import java.awt.Point;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        MoveablePoint moveablePoint = new MoveablePoint(100,100);
        System.out.println(" before move: "+moveablePoint.toString());
        for (int i=0;i<100;i++){
          moveablePoint.move();
      }
        System.out.println("after move: "+moveablePoint.toString());
    }
}
