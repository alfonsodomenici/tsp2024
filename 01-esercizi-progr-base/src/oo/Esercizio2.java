/*
 * Rappresentare un tipo Dado con una azione lancia che modifica lo stato del dado in maniera casuale
 * Fornire un main di prova
 * 
 */
package oo;

import java.util.Random;

public class Esercizio2 {
    public static void main(String[] args) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();

        int vinceD1 = 0;
        int vinceD2 = 0;
        for (int i = 0; i < 1000; i++) {
            System.out.println(String.format("Dado1= %s --- Dado2= %s", d1.lancia(), d2.lancia()));
            if (d1.getValore() > d2.getValore()) {
                vinceD1++;
            } else if (d2.getValore() > d1.getValore()) {
                vinceD2++;
            }
        }
        System.out.println("----------- risultato ------------------------");
        System.out.println(String.format("vittorieD1= %s --- vittorieD2= %s", vinceD1, vinceD2));
    }
}

class Dado {
    private int valore;
    private final int facce = 6;

    public int lancia() {
        Random rnd = new Random();
        valore = rnd.nextInt(facce) + 1;
        return valore;
    }

    /*
     * getters etc..
     * 
     */
    public int getValore() {
        return valore;
    }

    public int getFacce() {
        return facce;
    }

    @Override
    public String toString() {
        return "Dado [valore=" + valore + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + valore;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dado other = (Dado) obj;
        if (valore != other.valore)
            return false;
        return true;
    }

}