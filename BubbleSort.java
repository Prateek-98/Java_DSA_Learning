//It is a stable sorting algorithm(i.e, Order should be the same, when the value is same)
//It has a space complexity of O(1).
//It has the best time complexity of O(n) and worst time complexity of O(n2).

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5};
//        int[] arr = {1,2,3,4,5,6};
//        int[] arr = {};
//        int[] arr = { };
//        int[] arr = {-1,4,-35,20,0,-33,3,-99};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
//        run the steps n-1 times.
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
// for each step max item will come at the last respective index.
            for (int j = 1; j < arr.length-i ; j++) {
//                Swap the element of the array with the previous one if smaller than the previous one.
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            If for any particular iteration if i, there is no swapping then stop the program.
            if (!swapped){
                break;
            }
        }
    }






}



