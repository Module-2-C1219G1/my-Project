import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String myString = "abc cba1";
        Stack<Character> myStack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < myString.length(); i++) {
            myStack.push(myString.charAt(i));
            queue.add(myString.charAt(i));
        }
        System.out.println(myStack);
        System.out.println(queue);
        boolean check = true;
        for (int i = 0; i < myString.length(); i++) {
            char fromStack = myStack.pop();
            char fromQueue = queue.poll();
            if (fromStack != fromQueue) {
                check = false;
                    break;
            }
        }
        if (check) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
