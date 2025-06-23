package StaticandNonStaticAsst;

public class LibraryMember {
	    // Instance variables
	    int memberId;
	    String memberName;
	    int booksBorrowed;

	    // Constant: Maximum books a member can borrow
	    static final int MAX_ALLOWED_BOOKS = 5;

	    // Constructor
	    public LibraryMember(int memberId, String memberName, int booksBorrowed) {
	        this.memberId = memberId;
	        this.memberName = memberName;
	        this.booksBorrowed = booksBorrowed;
	    }

	    // Method to borrow books with a local variable to check the limit
	    public void borrowBooks(int count) {
	        // Local variable to calculate new total
	        int projectedTotal = booksBorrowed + count;

	        if (projectedTotal <= MAX_ALLOWED_BOOKS) {
	            booksBorrowed = projectedTotal;
	            System.out.println(memberName + " successfully borrowed " + count + " books.");
	            System.out.println("Total books now borrowed: " + booksBorrowed);
	        } else {
	            System.out.println("Cannot borrow " + count + " books.");
	            System.out.println("Borrowing limit exceeded! You already have " + booksBorrowed + " books.");
	        }
	        System.out.println("--------------------------");
	    }

	    // Method to display member details
	    public void displayMemberInfo() {
	        System.out.println("Member ID: " + memberId);
	        System.out.println("Name: " + memberName);
	        System.out.println("Books Borrowed: " + booksBorrowed);
	        System.out.println("--------------------------");
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        LibraryMember m1 = new LibraryMember(1, "Alice", 2);
	        LibraryMember m2 = new LibraryMember(2, "Bob", 4);

	        m1.displayMemberInfo();
	        m1.borrowBooks(2);  // Allowed
	        m1.borrowBooks(2);  // Exceeds limit

	        m2.displayMemberInfo();
	        m2.borrowBooks(1);  // Allowed
	        m2.borrowBooks(1);  // Exceeds limit
	    }
	}

