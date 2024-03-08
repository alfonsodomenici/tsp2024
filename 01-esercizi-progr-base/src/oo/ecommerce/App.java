package oo.ecommerce;

public class App {
    public static void main(String[] args) {
        System.out.println("-------------- Start ecommerce test --------------");

        Product p = new Product("caffe", 12);

        System.out.println(p);

        p.setName("zucchero");
        p.setPrice(2);

        System.out.println(p);

        p.setName(null);

        System.out.println(p);
    }
}
