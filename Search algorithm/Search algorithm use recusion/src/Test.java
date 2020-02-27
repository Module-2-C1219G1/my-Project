import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
          searchBinary(8,myArray);
    }


    public static void searchBinary(int value, int[] arr) {
        int middle = arr[0]+((arr[0]+arr[arr.length -1])/2);
        if (middle == value){
            System.out.println("in Array");
        }else if(middle > value){
            int[] array = Arrays.copyOfRange(arr,arr[0],arr[middle]);
            searchBinary(value,array);
        }else if (mid;){
            int[] array = Arrays.copyOfRange(arr,arr[0],arr[middle]);
            searchBinary(value,array);
        } else {
            if (arr.length == 1){
                System.out.print(" not in array");
            }
        }
    }
}