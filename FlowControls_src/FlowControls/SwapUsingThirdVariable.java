package FlowControls;

public class SwapUsingThirdVariable {
	    public static void main(String[] args) {
	        int[] arrA = {1, 2, 3};
	        int[] arrB = {4, 5, 6};

	        System.out.println("Before swapping:");
	        for (int i = 0; i < arrA.length; i++) {
	            System.out.println("a = " + arrA[i] + ", b = " + arrB[i]);
	        }

	        // Swapping each pair using third variable
	        for (int i = 0; i < arrA.length; i++) {
	            int temp = arrA[i];
	            arrA[i] = arrB[i];
	            arrB[i] = temp;
	        }

	        System.out.println("After swapping:");
	        for (int i = 0; i < arrA.length; i++) {
	            System.out.println("a = " + arrA[i] + ", b = " + arrB[i]);
	        }
	    }
	}

