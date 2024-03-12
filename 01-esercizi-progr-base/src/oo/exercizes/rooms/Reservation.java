package oo.exercizes.rooms;

import java.time.LocalDate;

public class Reservation {
    private final String name;
    private final LocalDate from;
    private final LocalDate to;

    public Reservation(String name, LocalDate from, LocalDate to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
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
        Reservation other = (Reservation) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (from == null) {
            if (other.from != null)
                return false;
        } else if (!from.equals(other.from))
            return false;
        if (to == null) {
            if (other.to != null)
                return false;
        } else if (!to.equals(other.to))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Reservation [name=" + name + ", from=" + from + ", to=" + to + "]";
    }

    public boolean isOverlapped(LocalDate f, LocalDate t) {
        return isReserved(f) || isReserved(t) || (f.isBefore(from) && t.isAfter(to));
    }

    private boolean isReserved(LocalDate d) {
        return from.isEqual(d) || to.isEqual(d) || (d.isAfter(from) && d.isBefore(to));
    }

}
