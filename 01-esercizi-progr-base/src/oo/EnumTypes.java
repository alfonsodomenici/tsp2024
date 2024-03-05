package oo;

import java.util.EnumSet;
import java.util.Scanner;

public class EnumTypes {

    public static enum Giorni {
        LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA
    }

    public static void main(String[] args) {

        Giorni g = Giorni.LUNEDI;

        if (g == Giorni.DOMENICA) {
            System.out.println(g);
        }

        Scanner s = new Scanner(System.in);
        System.out.println("scrivi un giorno della settimana");
        String giorno = s.nextLine();
        Giorni ggInserito = Giorni.valueOf(giorno.toUpperCase());
        System.out.println(ggInserito);

        if (g == Giorni.DOMENICA) {
            System.out.println("oggi è domenica");
        } else if (g == Giorni.LUNEDI) {
            System.out.println("mannaggia, è lunedi..");
        } else if (g == Giorni.SABATO) {
            System.out.println("ok sabb..");
        } else {
            System.out.println("caso non contemplato..");
        }

        switch (g) {
            case DOMENICA:

                break;
            case LUNEDI:

                break;
            case SABATO:

                break;
            default:

                break;
        }

        infraSettimanali().forEach(System.out::println);
    }

    private static EnumSet<Giorni> infraSettimanali() {
        EnumSet<Giorni> we = EnumSet.of(Giorni.SABATO, Giorni.DOMENICA);
        return EnumSet.complementOf(we);
    }
}
