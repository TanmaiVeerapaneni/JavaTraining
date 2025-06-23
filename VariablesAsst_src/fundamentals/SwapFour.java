package fundamentals;

public class SwapFour {
	public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // Rotate the values using one temp variable
        int temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);  // Should be 20
        System.out.println("b = " + b);  // Should be 30
        System.out.println("c = " + c);  // Should be 40
        System.out.println("d = " + d);  // Should be 10
    }
}

