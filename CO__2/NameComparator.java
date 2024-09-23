import java.util.Comparator;

// Comparator: compare items by name
class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2) {
        return i1.getName().compareTo(i2.getName());
    }
}
