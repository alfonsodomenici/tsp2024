package oo.ecommerce;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Storage {

    private Set<StorageItem> items = new HashSet<>();

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

    public void unload(Product product, int quantity) {
        StorageItem item = isAvailable(product, quantity);
        item.setQuantity(item.getQuantity() - quantity);
    }

    /*
     * ritorna la disponibilità oppure errore
     * 
     */
    public StorageItem isAvailable(Product product, int quantity) {
        StorageItem found = find(product).orElseThrow(() -> new StorageException("product not exist"));
        if (found.getQuantity() < quantity) {
            throw new StorageException("quantity in not sufficient");
        }
        return found;
    }

    public void discontinue(Product p) {
        StorageItem found = find(p).orElseThrow(() -> new StorageException("product not exist"));
        found.discontinue();
    }

    /*
     * ricerca il prodotto in magazzino
     */
    private Optional<StorageItem> find(Product p) {
        return items.stream()
                .filter(v -> v.getProduct().equals(p))
                .findFirst();
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

}
