public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addAtEnd("The Alchemist", "Paulo Coelho", "Fiction", 101, true);
        library.addAtEnd("1984", "George Orwell", "Dystopian", 102, false);
        library.addAtBeginning("To Kill a Mockingbird", "Harper Lee", "Classic", 103, true);
        library.addAtEnd("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 104, true);

        // Display all books (forward)
        library.displayBooksForward();

        // Display all books (reverse)
        library.displayBooksReverse();

        // Search for a book by title
        System.out.println("\nSearching for '1984':");
        Book foundBook = library.searchByTitle("1984");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook.title + " by " + foundBook.author);
        } else {
            System.out.println("Book not found.");
        }

        // Update book availability
        System.out.println("\nUpdating availability of Book ID 102...");
        library.updateAvailability(102, true);
        library.displayBooksForward();

        // Remove a book by Book ID
        System.out.println("\nRemoving Book ID 103...");
        library.removeByBookId(103);
        library.displayBooksForward();

        // Count total books
        System.out.println("\nTotal Books in Library: " + library.countBooks());
    }
}