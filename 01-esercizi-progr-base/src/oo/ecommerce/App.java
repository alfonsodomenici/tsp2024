package oo.ecommerce;

import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println("-------------- Start ecommerce test --------------");

        Product p = new Product("caffe", 12);

        Storage storage = new Storage();

        storage.load(new Product("caffe vergnano", 2), 100);
        storage.load(new Product("caffe lavazza", 3), 10);
        storage.load(new Product("caffe Illy", 4), 30);
        storage.load(new Product("spagetti", 2.5f), 200);
        storage.load(new Product("latte", 3), 12);
        storage.load(new Product("birra", 4.5f), 45);
        storage.load(new Product("birra", 4.8f), 60);

        storage.logStatus();

        List<Product> foundProducts = storage.findByNameAndAvailabilities("caffe",5);

        foundProducts.forEach(v -> v.setPrice(v.getPrice() * 1000));

        storage.logStatus();
        

    }
}
