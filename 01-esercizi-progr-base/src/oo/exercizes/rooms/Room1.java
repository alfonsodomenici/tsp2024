package oo.exercizes.rooms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Room1 {

    private List<Reservation> reservations = new ArrayList<>();

    public Reservation reserve(String name, LocalDate from, LocalDate to) {
        if(isReserved(from,to)){
            throw new RuntimeException("room is reserved...");
        }
        Reservation r = new Reservation(name, from, to);
        reservations.add(r);
        return r;
    }

    private boolean isReserved(LocalDate from, LocalDate to) {
        for (Reservation r : reservations) {
            if(r.isOverlapped(from,to)){
                return true;
            }
        }
        return false;
    }

    public List<Reservation> reservations() {
        return new ArrayList<>(reservations);
    }
}
