package fundamentals;

public class SwapTwoNumbers {
	public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping using a temp variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
	}
}
