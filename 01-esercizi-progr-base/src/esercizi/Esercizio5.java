/**
 * stampa i numeri primi tra 1 e N
 * 
 * start 
 *      leggi N
 *      conta = 1
 *      while(conta <= N) do
 *          if (conta è primo) then
 *              stampa conta
 *          end if
 *          conta = conta + 1
 *      end while      
 * end
 */

package esercizi;

import riutilizzo.Funzioni;

public class Esercizio5 {
    public static void main(String[] args) {
        int n = Funzioni.leggiNumero();
        int conta = 1;
        while (conta <= n) {
            if (Funzioni.isNumeroPrimo(conta)) {
                System.out.println(conta);
            }
            conta += 1;
        }
    }
}
