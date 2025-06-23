package FlowControls;
import java.util.Scanner;

public class FibonacciRecursive {
	    // Recursive method to find the nth Fibonacci number
	    public static int fibonacci(int n) {
	        if (n == 0)
	            return 0;
	        else if (n == 1)
	            return 1;
	        else
	            return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number of terms
	        System.out.print("Enter the number of terms: ");
	        int n = scanner.nextInt();

	        System.out.println("Fibonacci series up to " + n + " terms:");

	        // Use a for loop to print each term using the recursive method
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }

	        scanner.close();
	    }
	}

