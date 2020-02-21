import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        System.out.println("Enter number a: ");
        a = scanner.nextDouble();
        checkNumber(a);
        double b;
        System.out.println("Enter number b: ");
        b = scanner.nextDouble();
        checkNumber(b);
        double c;
        System.out.println("Enter number c: ");
        c = scanner.nextDouble();
        checkNumber(c);

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("delta: "+quadraticEquation.getDiscriminant());
        System.out.println("root A: "+quadraticEquation.getRootA());
        System.out.println("root B: "+quadraticEquation.getRootB());
        System.out.println("result: "+quadraticEquation.toString());
    }

    public static void checkNumber(double number) {

        Scanner sc = new Scanner(System.in);
        while ( number < 0) {
            System.out.println("Must be bigger than  or same Zero !");
            System.out.println("Enter another Number: ");
            number = sc.nextDouble();
        }
    }
}

