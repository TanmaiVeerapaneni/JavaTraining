package StaticandNonStaticAsst;

public class Book {
    // Instance variables
    String title;
    String author;
    int serialNumber;  // Unique for each book

    // Static variable shared across all books
    static int bookCount = 0;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;                  // Increase count when a book is created
        this.serialNumber = bookCount; // Assign unique serial number
    }

    // Method to print book information using a local variable
    public void printBookInfo() {
        // Local variable to hold serial number for printing
        int localSerial = serialNumber;

        System.out.println("Book Serial Number: " + localSerial);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("----------------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee");

        b1.printBookInfo();
        b2.printBookInfo();
        b3.printBookInfo();

        // Optional: Print total books created
        System.out.println("Total Books Created: " + Book.bookCount);
    }
}
