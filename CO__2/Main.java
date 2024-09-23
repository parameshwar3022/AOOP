public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        Item i1 = new Item("Laptop", 1200.99, 1);
        Item i2 = new Item("Smartphone", 699.50, 2);
        Item i3 = new Item("Headphones", 199.99, 5);
        Item i4 = new Item("Keyboard", 89.99, 3);

        cart.addItem(i1);
        cart.addItem(i2);
        cart.addItem(i3);
        cart.addItem(i4);

        // Sorting by Price (using Comparable)
        System.out.println("Sorted by Price:");
        cart.sortByPrice();
        for (Item item : cart) {
            System.out.println(item);
        }

        // Sorting by Name (using Comparator)
        System.out.println("\nSorted by Name:");
        cart.sortByName();
        for (Item item : cart) {
            System.out.println(item);
        }

        // Sorting by Quantity (using Comparator)
        System.out.println("\nSorted by Quantity:");
        cart.sortByQuantity();
        for (Item item : cart) {
            System.out.println(item);
        }

        // Cloning an item
        Item clonedItem = (Item) i1.clone();
        System.out.println("\nCloned Item: " + clonedItem);
    }
}
