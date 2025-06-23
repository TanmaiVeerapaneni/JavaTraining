package FlowControls;

public class SwapWithoutThird {
	    public static void main(String[] args) {
	        int[] a = {1, 2, 3};
	        int[] b = {4, 5, 6};

	        System.out.println("Before swapping:");
	        for (int i = 0; i < a.length; i++) {
	            System.out.println("a = " + a[i] + ", b = " + b[i]);
	        }

	        // Swapping each pair without using third variable
	        for (int i = 0; i < a.length; i++) {
	            a[i] = a[i] + b[i];
	            b[i] = a[i] - b[i];
	            a[i] = a[i] - b[i];
	        }

	        System.out.println("After swapping:");
	        for (int i = 0; i < a.length; i++) {
	            System.out.println("a = " + a[i] + ", b = " + b[i]);
	        }
	    }
	}


