/*
 * boolean isNumeroPrimo(num)
 * 
 * start
 *      if(num == 0) then
 *          return false
 *      end if
 * 
 *      conta = 2
 *      while (conta < num) do
 *          if(num % conta == 0) then
 *              return false
 *          end if
 *          conta=conta+1
 *      end while   
 *      return true
 * end
 * 
 * Altro modo
 * 
 *  * start
 *      risultato = true
 * 
 *      if(num == 0) then
 *          risultato = false
 *      end if
 * 
 *      conta = 2
 *      while (conta < num and risultato) do
 *          if(num % conta == 0) then
 *              risultato = false
 *          end if
 *          conta=conta+1
 *      end while   
 *      return risultato
 * end
 * 
 * 
 * start
 *      leggi n
 *      risultato = true
*       if(n<=2) then
 *          risultato = false
 *      end if
 * 
*       conta = 2
*       while(conta < n and risultato) do
*           if(resto di n/conta == 0) then
*               risultato=false
            end if
*           conta++
*       end while
*       stampa risultato
 *      
 * 
 */
package riutilizzo;

import java.util.Scanner;

public class Funzioni {

    public static int leggiNumero() {
        return leggiNumero("Inserisci un numero");
    }

    public static int leggiNumero(String msg) {
        System.out.println(msg);
        final Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        return n;
    }

    public static boolean isNumeroPrimo(int num) {
        boolean risultato = true;
        if (num <= 2) {
            risultato = false;
        }
        int conta = 2;
        while (conta < num && risultato) {
            if (num % conta == 0) {
                risultato = false;
            }
            conta++;
        }
        return risultato;
    }

    /*
     * public static boolean isNumeroPrimo(int num) {
     * if (num == 0)
     * return false;
     * int conta = 2;
     * while (conta < num) {
     * if (num % conta == 0)
     * return false;
     * conta++;
     * }
     * return true;
     * }
     */
}
