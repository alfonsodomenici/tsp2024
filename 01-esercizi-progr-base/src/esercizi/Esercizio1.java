/*
 * Stampare i numeri da 0 a N
 * 
 * inizio
 *      leggi N
 *      ris = 0
 *      while (ris<=n) do
 *          stampa ris
 *          ris = ris + 1
 *      end while
 * fine
 * 
 * prova
 * n=3
 * ris=0|1|2|3|4
 * stampa 0|1|2|3
 */

package esercizi;

import riutilizzo.Funzioni;

public class Esercizio1 {
    public static void main(String[] args) {
        int n = Funzioni.leggiNumero();
        int ris = 0;
        while (ris <= n) {
            System.out.println(ris);
            ris = ris + 1;
        }
    }


}