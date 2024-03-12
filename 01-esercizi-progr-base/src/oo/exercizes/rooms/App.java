package oo.exercizes.rooms;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Room1 r = new Room1();
        r.reserve("alfonso", LocalDate.of(2024, 02, 10),
                LocalDate.of(2024, 02, 20));
        r.reserve("alfonso", LocalDate.of(2024, 03, 05),
                LocalDate.of(2024, 03, 30));

        r.reserve("maria", LocalDate.of(2024, 02, 21),
                LocalDate.of(2024, 02, 28));

        for (Reservation res : r.reservations()) {
            System.out.println(res);
        }
    }
}
