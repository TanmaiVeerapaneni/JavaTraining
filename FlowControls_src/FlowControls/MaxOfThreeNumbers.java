package FlowControls;
import java.util.Scanner;

public class MaxOfThreeNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input three numbers
	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter third number: ");
	        int num3 = scanner.nextInt();

	        // Determine the maximum using if-else
	        if (num1 >= num2 && num1 >= num3) {
	            System.out.println("Maximum number is: " + num1);
	        } else if (num2 >= num1 && num2 >= num3) {
	            System.out.println("Maximum number is: " + num2);
	        } else {
	            System.out.println("Maximum number is: " + num3);
	        }
}
}