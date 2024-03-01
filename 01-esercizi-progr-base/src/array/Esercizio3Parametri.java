package array;

import java.util.Arrays;

public class Esercizio3Parametri {
    public static void main(String[] args) {
        int numero = 123;
        pTipoPrimitivo(numero);
        System.out.println("numero vale: " + numero); // 123

        int[] numeri = { 3, 5, 7 };
        pTipoArray(numeri);
        System.out.println("l'array originale è: " + Arrays.toString(numeri)); //[30,50,70]
        pTipoArray1(numeri);
        System.out.println("l'array originale è: " + Arrays.toString(numeri)); //[30,50,70]
    }

    private static void pTipoArray(int[] arr) {
        System.out.println("il parametro vale:" + Arrays.toString(arr));
        int i=0;
        while(i<arr.length){
            arr[i]=arr[i]*10;
            i++;
        }
        System.out.println("il parametro modificato vale:" + Arrays.toString(arr)); //[30,50,70]
    }

    private static void pTipoArray1(int[] arr) {
        System.out.println("il parametro vale:" + Arrays.toString(arr));
        int[] nuovo = {12,45,3,5,7,8,9};
        arr=nuovo;
        System.out.println("il parametro modificato vale:" + Arrays.toString(arr)); //[12,45,3,5,7,8,9]
    }

    private static void pTipoPrimitivo(int a) {
        System.out.println("il parametro vale: " + a);
        a = a * 10;
        System.out.println("Ho modificato a: " + a); // 1230
    }
}
