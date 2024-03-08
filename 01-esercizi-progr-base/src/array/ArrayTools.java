package array;

import java.util.Objects;

public class ArrayTools {

    private ArrayTools(){

    }

    public static void linearSequence(int[] data, int a, int b) {
        data = Objects.requireNonNullElse(data,new int[0]);
        int i = 0;
        while (i < data.length) {
            data[i] = a * i + b;
            i++;
        }
    }

    /**
     * 
     * 
     * @param arr
     */
    public static void print(int[] arr) {
        arr = Objects.requireNonNullElse(arr,new int[0]);
        System.out.println("---------- print array -----------------");
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }

}
