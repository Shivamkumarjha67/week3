public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding items
        inventory.addAtEnd("Laptop", 101, 5, 55000);
        inventory.addAtEnd("Mouse", 102, 10, 500);
        inventory.addAtEnd("Keyboard", 103, 7, 1500);
        inventory.addAtBeginning("Monitor", 104, 3, 12000);

        // Display inventory
        inventory.displayInventory();

        // Update quantity
        inventory.updateQuantity(102, 15);

        // Search items
        System.out.println("\nSearching for Item ID 102:");
        Item foundItem = inventory.searchByItemId(102);
        if (foundItem != null) {
            System.out.println("Found: " + foundItem.itemName + " with Quantity: " + foundItem.quantity);
        }

        // Calculate total value
        System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalValue());

        // Sort by name
        inventory.sortByItemName();
        System.out.println("\nSorted Inventory by Name:");
        inventory.displayInventory();

        // Sort by price
        inventory.sortByPrice();
        System.out.println("\nSorted Inventory by Price:");
        inventory.displayInventory();
    }
}
