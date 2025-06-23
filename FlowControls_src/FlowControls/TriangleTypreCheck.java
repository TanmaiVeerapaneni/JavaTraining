package FlowControls;
import java.util.Scanner;

public class TriangleTypreCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input lengths of the three sides
	        System.out.print("Enter side 1: ");
	        int side1 = scanner.nextInt();

	        System.out.print("Enter side 2: ");
	        int side2 = scanner.nextInt();

	        System.out.print("Enter side 3: ");
	        int side3 = scanner.nextInt();

	        // Check if it's a valid triangle first (triangle inequality)
	        if (side1 + side2 > side3 &&
	            side1 + side3 > side2 &&
	            side2 + side3 > side1) {

	            // Check triangle type
	            if (side1 == side2 && side2 == side3) {
	                System.out.println("It is an Equilateral triangle.");
	            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
	                System.out.println("It is an Isosceles triangle.");
	            } else {
	                System.out.println("It is a Scalene triangle.");
	            }

	        } else {
	            System.out.println("The given sides do not form a valid triangle.");
	        }

	        scanner.close();
	    }
	}

