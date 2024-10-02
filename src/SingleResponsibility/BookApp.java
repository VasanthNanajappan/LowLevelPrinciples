package SingleResponsibility;

public class BookApp {
    public static void main(String[] args) {
        // Initialize the book inventory with some books
        String[] initialBooks = {"Atomic Habits", "Psychology Of Money", "Deep Work"};
        LibBookInventory lib = new LibBookInventory(initialBooks);

        // Create an instance of BookPrints
        BookPrints print = new BookPrints();

        // Example usage: Print details of each book in the inventory
        for (int i = 0; i < initialBooks.length; i++) {
            String book = lib.getBook(i);
            print.print(book);  // Pass the book title to the print method
        }
    }
}
