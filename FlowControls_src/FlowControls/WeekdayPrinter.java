package FlowControls;
import java.util.Scanner;
public class WeekdayPrinter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input week number from user
	        System.out.print("Enter week number (1 to 7): ");
	        int day = scanner.nextInt();

	        // Use if-else to determine weekday
	        if (day == 1) {
	            System.out.println("Sunday");
	        } else if (day == 2) {
	            System.out.println("Monday");
	        } else if (day == 3) {
	            System.out.println("Tuesday");
	        } else if (day == 4) {
	            System.out.println("Wednesday");
	        } else if (day == 5) {
	            System.out.println("Thursday");
	        } else if (day == 6) {
	            System.out.println("Friday");
	        } else if (day == 7) {
	            System.out.println("Saturday");
	        } else {
	            System.out.println("Invalid input! Please enter a number from 1 to 7.");
	        }

	        scanner.close();
	    }
	}
