package oo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TipiOggetto {

    public static void main(String[] args) {
        
        String message = new String("ciao");

        String messageUpperCase = message.toUpperCase();

        System.out.println(message);

        System.out.println(messageUpperCase);
        
        System.out.println(MiaMath.somma(3,6,7));
       
    }
}

class MiaMath {
   
    //costruttore
    private MiaMath(){
        System.out.println("costruisco istanza di MiaMath");
    }

    public static long somma(int... op){
        long res = 0;
        for (int n : op) {
            res+=n;
        }
        return res;
    }
    public static long moltiplica(int... op){
        long res = 0;
        for (int n : op) {
            res*=n;
        }
        return res;
    }
}

