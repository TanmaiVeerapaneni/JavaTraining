package StaticandNonStaticAsst;

public class MovieTicket {
	    // Instance variables
	    String movieName;
	    String seatNumber;

	    // Static variable shared across all tickets
	    static int totalTicketsSold = 0;

	    // Constructor
	    public MovieTicket(String movieName, String seatNumber) {
	        this.movieName = movieName;
	        this.seatNumber = seatNumber;
	        totalTicketsSold++;  // Increment ticket count when a new ticket is booked
	    }

	    // Method to display ticket info and total tickets sold
	    public void displayTicket() {
	        System.out.println("Movie: " + movieName);
	        System.out.println("Seat: " + seatNumber);
	        System.out.println("Total Tickets Sold: " + totalTicketsSold);
	        System.out.println("--------------------------");
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        MovieTicket t1 = new MovieTicket("Avengers: Endgame", "A10");
	        t1.displayTicket();

	        MovieTicket t2 = new MovieTicket("Avengers: Endgame", "A11");
	        t2.displayTicket();

	        MovieTicket t3 = new MovieTicket("Inception", "B5");
	        t3.displayTicket();
	    }
	}


