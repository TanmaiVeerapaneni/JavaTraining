package Arrays;
import java.util.Scanner;


public class ArrayVerage {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read array size
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        // 2. Declare and populate the array
	        double[] numbers = new double[n];
	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = sc.nextDouble();
	        }

	        // 3. Compute the sum
	        double sum = 0;
	        for (double value : numbers) {
	            sum += value;
	        }

	        // 4. Calculate and display the average
	        double average = (n > 0) ? sum / n : 0;   // avoid divide-by-zero
	        System.out.println("Average value = " + average);

	        sc.close();
	    }
	}


