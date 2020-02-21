import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArrays {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Array: " + Arrays.toString(myArray));
        System.out.println("-----------------------------------------");
        System.out.println("Enter the element you want delete: \n");
        int element = scanner.nextInt();
        boolean check = false;
        for (int i : myArray) {
            if (element == i) {

                check = true;
                break;
            }
        }

        if (!check) {
            System.out.println("Your element isn't in array !");
        } else {
            int[] newArray = new int[myArray.length - 1];
            for (int countMyArray = 0, countNewArray = 0; countNewArray < newArray.length; countNewArray++) {
                if (myArray[countMyArray] == element) {
                    countMyArray++;
                }
                newArray[countNewArray] = myArray[countMyArray];
                countMyArray++;
            }
            System.out.println("Your new Array: " + Arrays.toString(newArray));
        }
    }
}
