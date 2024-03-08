package oo;

import java.util.ArrayList;
import java.util.List;

public class Esercizio4 {
    public static void main(String[] args) {
        ShoppingCardItem item1 = new ShoppingCardItem("guanti da sci", 15.25f, 1);
        ShoppingCardItem item2 = new ShoppingCardItem("scarponi da sci", 100.25f, 1);
        ShoppingCardItem item3 = new ShoppingCardItem("sci", 200.25f, 1);
        ShoppingCardItem item4 = new ShoppingCardItem("guanti da sci", 24.25f, 1);

        System.out.println(item1.equals(item2)); // false
        System.out.println(item1.equals(item4)); // true
        
        System.out.println(item2);

        item2.setQuantity(2);

        System.out.println(item2);

        ShoppingCardItemRec rec1 = new ShoppingCardItemRec("caffe",     10,  4);
        System.out.println(rec1);


        var shoppingCard = new ArrayList<>();

        shoppingCard.add(new ShoppingCardItem("zucchero", 2, 1));
        shoppingCard.add(new ShoppingCardItem("caffe", 2.5f, 10));

    }

}

class ShoppingCardItem {
    private String product;
    private float price;
    private int quantity;

    public ShoppingCardItem(String product, float price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalPrice() {
        return price * quantity;
    }

    /*
     * getters setters
     */
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((product == null) ? 0 : product.hashCode());
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
        ShoppingCardItem other = (ShoppingCardItem) obj;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ShoppingCardItem [product=" + product + ", price=" + price + ", quantity=" + quantity + "]";
    }

}


record ShoppingCardItemRec(String product, float price, int quantity){

    public double totalPrice(){
        return price * quantity;
    }
}