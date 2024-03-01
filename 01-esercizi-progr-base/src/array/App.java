package array;

import riutilizzo.Funzioni;

public class App {

    static int x;

    static String message;

    public static void main(String[] args) {
        System.out.println("-------- start program ---------");
        mprivato();
        System.out.println("chiamo il metodo m1");
        m1();
        System.out.println("fine chiamata ad m1, proseguo...");
        System.out.println("termine programma");
        m2("ciao dal main");
        stampaMessaggiACaso();
        int[] numeri = {1,4,6};
        int[] numeri1 = new int[5];
        int[] numeri2=null;
        int a =10; //variabile locale al metodo main
        m5(numeri,  a, 12);
        m5(numeri1,2,4);
        m5(numeri2,4,6);
        while(a < 0){
            int x=10;
        }

        {
            int x= 20;
        }
        boolean ris = Funzioni.isNumeroPrimo(359000);
        System.out.println(ris);
    }

    public static void m1() {
        System.out.println("sono m1");
    }

    public static void m2(String msg) {
        System.out.println("sono m2 e tu mi hai passato questo messaggio: " + msg);
    }

    public static void m3() {
        System.out.println("sono m3");
    }

    public static void m4() {
        System.out.println("sono m4");
    }

    public static void stampaMessaggiACaso() {
        for (int i = 0; i < 100; i++) {
            m2("messagio " + i);
        }
    }

    public static void m5(int[] data, int a, int b){

    }

    private static void mprivato(){
        System.out.println("sono un metodo privato di App");
    }
}
