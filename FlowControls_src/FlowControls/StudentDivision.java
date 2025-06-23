package FlowControls;
import java.util.Scanner;

public class StudentDivision {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input total marks and marks obtained
	        System.out.print("Enter total marks: ");
	        int totalMarks = scanner.nextInt();

	        System.out.print("Enter marks obtained: ");
	        int obtainedMarks = scanner.nextInt();

	        // Calculate percentage
	        double percentage = (obtainedMarks * 100.0) / totalMarks;

	        // Display the percentage
	        System.out.println("Percentage: " + percentage + "%");

	        // Determine division using if-else
	        if (percentage >= 60) {
	            System.out.println("Division: First Division");
	        } else if (percentage >= 45) {
	            System.out.println("Division: Second Division");
	        } else if (percentage >= 30) {
	            System.out.println("Division: Third Division");
	        } else {
	            System.out.println("Result: Fail");
	        }

	        scanner.close();
	    }
	}
