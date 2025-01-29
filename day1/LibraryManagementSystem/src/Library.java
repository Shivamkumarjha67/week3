class Library {
    private Book head;
    private Book tail;
    private int totalBooks;

    public Library() {
        this.head = null;
        this.tail = null;
        this.totalBooks = 0;
    }

    // **1. Add a book at the beginning**
    public void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
    }

    // **2. Add a book at the end**
    public void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
    }

    // **3. Add a book at a specific position**
    public void addAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position <= 0) {
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        Book current = head;
        int count = 0;

        while (count < position - 1 && current != null) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            addAtEnd(title, author, genre, bookId, isAvailable);
        } else {
            newBook.next = current.next;
            newBook.prev = current;
            current.next.prev = newBook;
            current.next = newBook;
        }
        totalBooks++;
    }

    // **4. Remove a book by Book ID**
    public void removeByBookId(int bookId) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book current = head;

        while (current != null && current.bookId != bookId) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Book ID not found.");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        totalBooks--;
    }

    // **5. Search for a book by Title**
    public Book searchByTitle(String title) {
        Book current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // **6. Search for a book by Author**
    public Book searchByAuthor(String author) {
        Book current = head;
        while (current != null) {
            if (current.author.equalsIgnoreCase(author)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // **7. Update book availability status**
    public void updateAvailability(int bookId, boolean isAvailable) {
        Book current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = isAvailable;
                return;
            }
            current = current.next;
        }
        System.out.println("Book ID not found.");
    }

    // **8. Display all books in forward order**
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("\nBooks in Forward Order:");
        Book current = head;
        while (current != null) {
            System.out.println("Book ID: " + current.bookId +
                    ", Title: " + current.title +
                    ", Author: " + current.author +
                    ", Genre: " + current.genre +
                    ", Available: " + (current.isAvailable ? "Yes" : "No"));
            current = current.next;
        }
    }

    // **9. Display all books in reverse order**
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("\nBooks in Reverse Order:");
        Book current = tail;
        while (current != null) {
            System.out.println("Book ID: " + current.bookId +
                    ", Title: " + current.title +
                    ", Author: " + current.author +
                    ", Genre: " + current.genre +
                    ", Available: " + (current.isAvailable ? "Yes" : "No"));
            current = current.prev;
        }
    }

    // **10. Count the total number of books**
    public int countBooks() {
        return totalBooks;
    }
}
