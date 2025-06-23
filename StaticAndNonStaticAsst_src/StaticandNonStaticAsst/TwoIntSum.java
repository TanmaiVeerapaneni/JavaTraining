package StaticandNonStaticAsst;

public class TwoIntSum {
	public static int addNumbers(int a, int b) {
	        // Local variables to store the inputs
	        int num1 = a;
	        int num2 = b;

	        // Local variable to store the sum
	        int sum = num1 + num2;

	        // Return the result
	        return sum;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int result = addNumbers(10, 20);
	        System.out.println("The sum is: " + result);
	    }
	}

