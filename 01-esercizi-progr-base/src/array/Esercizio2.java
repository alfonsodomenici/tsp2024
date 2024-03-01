package array;

public class Esercizio2 {
    public static void main(String[] args) {
        int numeri[] = {4,3,6,67,34};
        int i = 0;
        while(i < numeri.length){
            System.out.println(numeri[i]);
            i++;
        }

        stampaInversa(numeri);
        stampaPari(numeri);
    }


    private static void stampaInversa(int[] arr){
        System.out.println("----------- stampa inversa ---------------");
        int i = arr.length-1;
        while(i>=0){
            System.out.println(arr[i]);
            i--;
        }
    }

    private static void stampaPari(int arr[]){
        System.out.println("----------- stampa pari ---------------");
        int i = 0;
        while(i < arr.length){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
            i++;
        }
        
    }
}
