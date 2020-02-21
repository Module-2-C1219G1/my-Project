import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] myArray = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Your array: "+Arrays.toString(myArray));
        System.out.println("--------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element you want insert: ");
        int element = scanner.nextInt();
        System.out.println("Enter the index you want insert: ");
        int index = scanner.nextInt();
        if (index < myArray.length) {
            int[] newArray = new int[myArray.length + 1];
            for (int countNewArray = 0, countMyArray = 0; countNewArray < newArray.length; countNewArray++) {
                if (index == countNewArray) {
                    newArray[countNewArray] = element;
                    countNewArray++;
                }
                newArray[countNewArray] = myArray[countMyArray];
                countMyArray++;
            }
            System.out.println("New Array: " + Arrays.toString(newArray));
        }else {
            System.out.println("Index undefined");
        }
    }

}
