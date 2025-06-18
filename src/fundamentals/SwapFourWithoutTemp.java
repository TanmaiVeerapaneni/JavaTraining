package fundamentals;

public class SwapFourWithoutTemp {
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

        // Combine all values into one sum
        a = a + b + c + d; // a = total sum
        d = a - (b + c + d); // d = original a
        c = a - (b + c + d); // c = original d
        b = a - (b + c + d); // b = original c
        a = a - (b + c + d); // a = original b

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);  // Should be 20
        System.out.println("b = " + b);  // Should be 30
        System.out.println("c = " + c);  // Should be 40
        System.out.println("d = " + d);  // Should be 10
    }
}
