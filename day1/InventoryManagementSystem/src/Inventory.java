public class Inventory {
    private Item head;

    public Inventory() {
        this.head = null;
    }

    // **1. Add an item at the beginning**
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // **2. Add an item at the end**
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newItem;
        }
    }

    // **3. Add an item at a specific position**
    public void addAtPosition(int position, String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (position <= 0) {
            addAtBeginning(itemName, itemId, quantity, price);
        } else {
            Item current = head;
            int count = 0;
            while (count < position - 1 && current.next != null) {
                current = current.next;
                count++;
            }
            newItem.next = current.next;
            current.next = newItem;
        }
    }

    // **4. Remove an item by Item ID**
    public void removeByItemId(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.itemId == itemId) {
            head = head.next;
            return;
        }

        Item current = head;
        Item prev = null;
        while (current != null && current.itemId != itemId) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Item ID not found.");
            return;
        }

        prev.next = current.next;
    }

    // **5. Update quantity by Item ID**
    public void updateQuantity(int itemId, int newQuantity) {
        Item current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                return;
            }
            current = current.next;
        }
        System.out.println("Item ID not found.");
    }

    // **6. Search item by ID**
    public Item searchByItemId(int itemId) {
        Item current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // **7. Search item by Name**
    public Item searchByItemName(String itemName) {
        Item current = head;
        while (current != null) {
            if (current.itemName.equalsIgnoreCase(itemName)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // **8. Calculate total inventory value**
    public double calculateTotalValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.quantity * current.price;
            current = current.next;
        }
        return totalValue;
    }

    // **9. Display all items**
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        Item current = head;
        System.out.println("Inventory List:");
        while (current != null) {
            System.out.println("Item ID: " + current.itemId +
                    ", Name: " + current.itemName +
                    ", Quantity: " + current.quantity +
                    ", Price: " + current.price);
            current = current.next;
        }
    }

    // **10. Sort inventory by Item Name (Merge Sort)**
    public void sortByItemName() {
        head = mergeSort(head, "name");
    }

    // **11. Sort inventory by Price (Merge Sort)**
    public void sortByPrice() {
        head = mergeSort(head, "price");
    }

    // **Helper function: Merge Sort Implementation**
    private Item mergeSort(Item head, String criterion) {
        if (head == null || head.next == null) {
            return head;
        }

        // Split list into two halves
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, criterion);
        Item right = mergeSort(nextOfMiddle, criterion);

        return merge(left, right, criterion);
    }

    private Item merge(Item left, Item right, String criterion) {
        if (left == null) return right;
        if (right == null) return left;

        Item result;
        if (criterion.equals("name")) {
            if (left.itemName.compareToIgnoreCase(right.itemName) < 0) {
                result = left;
                result.next = merge(left.next, right, criterion);
            } else {
                result = right;
                result.next = merge(left, right.next, criterion);
            }
        } else { // Sorting by price
            if (left.price < right.price) {
                result = left;
                result.next = merge(left.next, right, criterion);
            } else {
                result = right;
                result.next = merge(left, right.next, criterion);
            }
        }
        return result;
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;

        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

