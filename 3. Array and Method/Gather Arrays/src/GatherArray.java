import java.util.Arrays;
public class GatherArray {
    public static void main(String[] args) {
       int[] array1 = {0,1,2,3,4,5};
       int[] array2 = {6,7,8,9,10,11};
        System.out.println("array1: "+ Arrays.toString(array1));
        System.out.println("array1: "+ Arrays.toString(array2));
        System.out.println("---------------------------------");
        System.out.println("New Array: ");
        int[] newArray = new int[array1.length+array2.length];
        int countNewArray,countArray1,countArray2;
        for ( countNewArray = 0,countArray1 = 0,countArray2 = 0;countNewArray<newArray.length;countNewArray++,countArray1++){
            if (countNewArray < array1.length){
                newArray[countNewArray] = array1[countArray1];
                continue;
            }
            newArray[countNewArray] = array2[countArray2];
            countArray2++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
