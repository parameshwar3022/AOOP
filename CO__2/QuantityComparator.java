import java.util.Comparator;

// Comparator: compare items by quantity
class QuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2) {
        return Integer.compare(i1.getQuantity(), i2.getQuantity());
    }
}
