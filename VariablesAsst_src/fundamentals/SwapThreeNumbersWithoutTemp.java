package fundamentals;

public class SwapThreeNumbersWithoutTemp {

	    public static void main(String[] args) {
	        int a = 1;
	        int b = 2;
	        int c = 3;

	        System.out.println("Before swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        System.out.println("c = " + c);

	        // Swapping: a → b, b → c, c → a (no temp variable)
	        a = a + b + c;  // total sum
	        c = a - (b + c);  // c = original a
	        b = a - (b + c);  // b = original c
	        a = a - (b + c);  // a = original b

	        System.out.println("\nAfter swapping:");
	        System.out.println("a = " + a);  // Should be 2
	        System.out.println("b = " + b);  // Should be 3
	        System.out.println("c = " + c);  // Should be 1
	    }

}
