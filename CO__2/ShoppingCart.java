import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ShoppingCart implements Iterable<Item> {
    private List<Item> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItem(Item item) {
        cart.add(item);
    }

    public void sortByPrice() {
        cart.sort(null); // Uses Comparable's compareTo method
    }

    public void sortByName() {
        cart.sort(new NameComparator());
    }

    public void sortByQuantity() {
        cart.sort(new QuantityComparator());
    }

    // Iterator: allows looping over cart items
    @Override
    public Iterator<Item> iterator() {
        return cart.iterator();
    }
}
