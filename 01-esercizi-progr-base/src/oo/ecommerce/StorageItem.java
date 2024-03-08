package oo.ecommerce;

import java.util.Objects;

public class StorageItem {

    public static enum State {
        IN_STOCK, OUT_OF_STOCK, DISCONTINUED
    }

    private Product product;
    private int quantity;
    private State state;

    public StorageItem(Product product, int quantity) {
        Objects.requireNonNull(product, "empty product not allowed");
        this.product = product;
        setQuantity(quantity);
    }

    public Product getProduct() {
        return product;
    }

    public State getState() {
        return state;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("negative quantity not allowed");
        }
        this.quantity = quantity;
        this.state = this.quantity > 0 ? State.IN_STOCK : State.OUT_OF_STOCK;
    }

    public void discontinue() {
        this.state = State.DISCONTINUED;
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
        StorageItem other = (StorageItem) obj;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "StorageItem [product=" + product + ", quantity=" + quantity + ", state=" + state + "]";
    }

}
