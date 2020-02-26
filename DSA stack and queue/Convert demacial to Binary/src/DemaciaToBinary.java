import java.util.Stack;

public class DemaciaToBinary {
    public static void main(String[] args) {
        System.out.println(" 30 sang nhi phan: " + decimalToBinary(30));
        System.out.println(" 40 sang nhi phan: " + decimalToBinary(40));
        System.out.println(" 50 sang nhi phan: " + decimalToBinary(50));
        System.out.println(" 60 sang nhi phan: " + decimalToBinary(60));
    }

    public static Stack<Integer> decimalToBinary(int number) {
        Stack<Integer> myStack = new Stack<>();
        while (number > 0) {
            int data = number % 2;
            myStack.push(data);
            number = number / 2;
        }
        return myStack;
    }

}

