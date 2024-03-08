package oo.ecommerce;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 
 * 
 * 
 */
public class Storage {

    private Set<StorageItem> items = new HashSet<>();

    /*
     * ------------------------ public methods ------------------------------------
     */
    /**
     * carica un prodotto a magazzino
     * 
     * @param product
     * @param quantity
     */
    public void load(Product product, int quantity) {
        StorageItem item = find(product)
                .orElse(new StorageItem(product, 0));
        item.setQuantity(item.getQuantity() + quantity);
        items.add(item);

    }

    /*
     * scarica un prodotto dal magazzino
     * 
     */
    public void unload(Product product, int quantity) {
        StorageItem item = isAvailable(product, quantity);
        item.setQuantity(item.getQuantity() - quantity);
    }

    public void discontinue(Product p) {
        StorageItem found = find(p)
                .orElseThrow(() -> new StorageException("product not exist"));
        found.discontinue();
    }

    public List<Product> findByName(String name) {
        return items.stream()
                .filter(v -> v.getProduct().getName().contains(name))
                .map(v -> v.getProduct())
                .collect(Collectors.toList());
    }

    public List<Product> findByNameAndAvailabilities(String name, int quantity) {
        return items.stream()
                .filter(v -> v.getProduct().getName().contains(name) && v.getQuantity() > quantity)
                .map(v -> v.getProduct())
                .collect(Collectors.toList());
    }

    public void logStatus() {
        System.out.println("-------------STORAGE STATUS ---------------------");
        items.forEach(v -> System.out.println(v));
        System.out.println("-------------STORAGE STATUS ---------------------");
    }

    /*
     * -------------------------------- private meyhods
     * ------------------------------------
     */
    /*
     * ricerca il prodotto in magazzino
     */
    private Optional<StorageItem> find(Product p) {
        return items.stream()
                .filter(v -> v.getProduct().equals(p))
                .findFirst();
    }

    /*
     * ritorna la disponibilità oppure errore
     * 
     */
    private StorageItem isAvailable(Product product, int quantity) {
        StorageItem found = find(product).orElseThrow(() -> new StorageException("product not exist"));
        if (found.getQuantity() < quantity) {
            throw new StorageException("quantity in not sufficient");
        }
        return found;
    }

    /*
     * ricerca il prodotto in magazzino
     */
    private Optional<StorageItem> findOldJava(Product p) {
        Optional<StorageItem> result = Optional.empty();

        for (StorageItem item : items) {
            if (item.getProduct().equals(p)) {
                result = Optional.of(item);
                break;
            }
        }

        return result;
    }

    public void loadOldJava(Product product, int quantity) {

        Optional<StorageItem> tmp = find(product);
        StorageItem it;
        if (tmp.isPresent()) {
            it = tmp.get();
            it.setQuantity(it.getQuantity() + quantity);
        } else {
            it = new StorageItem(product, quantity);
            items.add(it);
        }

    }

    private class StorageItem {

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
}
