/*
 * Creare un tipo che rappresenti un punto su un un piano 
 * cartesiano. Gli oggetti punto devono essere immodificabili.
 * Scrivere toString e equals. 
 * Fare un metodo move(deltaX,deltaY)
 * Scrivere un main che utilizzi come esempio degli oggetto di 
 * tipo punto. 
 * 
 * 
 */
package oo;

public class Esercizio1 {
    public static void main(String[] args) {
        Punto p1 = new Punto(15, 100);

        Punto p2 = new Punto(15, 100);

        Punto[] linea = { new Punto(0, 5),
                new Punto(10, 20),
                new Punto(30, 80) };

        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        p1 = p1.move(4, 6);
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));

        Point point1 = new Point(5, 5);

        Point point2 = new Point(5, 5);

        System.out.println(point1.toString());
        System.out.println(point1.equals(point2));

    }
}

// immutable
final class Punto {
    private final int x;
    private final int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto move(int deltaX, int deltaY) {
        return new Punto(
                x + deltaX,
                y + deltaY);
    }

    /*
     * getters..
     */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
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
        Punto other = (Punto) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

}

record Point(int x, int y) {

    public Point move(int deltaX, int deltaY) {
        return new Point(
                x + deltaX,
                y + deltaY);
    }
}