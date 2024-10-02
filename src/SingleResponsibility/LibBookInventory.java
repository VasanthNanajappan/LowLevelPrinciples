package SingleResponsibility;

public class LibBookInventory {
    private String[] books; // Properly naming the array to 'books'

    // Constructor to initialize the books array
    public LibBookInventory(String[] initialBooks) {
        this.books = initialBooks; // Initialize with given array
    }

    // Getter method to retrieve a book by index
    public String getBook(int n) {
        if (n >= 0 && n < books.length) { // Check for out-of-bounds access
            return books[n];
        } else {
            return "Index out of range"; // Error handling for invalid index
        }
    }

    // Optionally, you can add methods to manage the inventory

    // Method to add a book
    public void addBook(String newBook) {
        String[] newBooks = new String[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = newBook;
        this.books = newBooks;
    }

    // Method to remove a book by index
    public boolean removeBook(int index) {
        if (index >= 0 && index < books.length) {
            String[] newBooks = new String[books.length - 1];
            for (int i = 0, j = 0; i < books.length; i++) {
                if (i != index) {
                    newBooks[j++] = books[i];
                }
            }
            this.books = newBooks;
            return true;
        }
        return false;
    }

    // Method to list all books
    public void listBooks() {
        System.out.println("Book Inventory:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}
