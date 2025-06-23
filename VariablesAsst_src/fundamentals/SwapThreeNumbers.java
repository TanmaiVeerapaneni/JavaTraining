package fundamentals;

public class SwapThreeNumbers {
	public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Swapping values: a → b, b → c, c → a
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);  // Should be 2
        System.out.println("b = " + b);  // Should be 3
        System.out.println("c = " + c);  // Should be 1
    }

}
