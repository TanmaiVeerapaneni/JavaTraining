package Arrays;
import java.util.Scanner;

public class SeparateEvenOdd {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Input array size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        // 2. Read array elements
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3. Create result array
	        int[] result = new int[n];
	        int evenIndex = 0;
	        int oddIndex = n - 1;

	        // 4. Place even at front and odd at back
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                result[evenIndex++] = num;
	            } else {
	                result[oddIndex--] = num;
	            }
	        }

	        // 5. Output result (even numbers in front, then odd in reversed order)
	        //    If you want to maintain odd numbers in input order, use two loops instead.
	        System.out.println("Array with evens first, then odds:");
	        for (int i = 0; i < evenIndex; i++) {
	            System.out.print(result[i] + " ");
	        }
	        for (int i = n - 1; i > oddIndex; i--) {
	            System.out.print(result[i] + " ");
	        }

	        sc.close();
	    }
	}



