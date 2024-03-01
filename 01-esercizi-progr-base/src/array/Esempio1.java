package array;

import java.util.Arrays;

public class Esempio1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;

        int numeri1[] = {1,3,5,7,9};
        int numeri2[] = {1,3,5,7,10};

        System.out.println(x==y); //true

        System.out.println(numeri1==numeri2); //false

        System.out.println(numeri1);
        System.out.println(numeri2);

        System.out.println("-------------- stampa array --------------------");
        int idx = 0;
        while(idx< numeri1.length){
            System.out.println(numeri1[idx]);
            idx++;
        }

        System.out.println(Arrays.toString(numeri1));

        System.out.println(Arrays.equals(numeri1, numeri2)); //true
    }
}
