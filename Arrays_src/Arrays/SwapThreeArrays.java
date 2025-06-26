package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class SwapThreeArrays {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read size
	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();

	        // 2. Initialize arrays
	        int[] arr1 = new int[n];
	        int[] arr2 = new int[n];
	        int[] arr3 = new int[n];

	        // 3. Read elements of arr1
	        System.out.println("Enter elements for array 1:");
	        for (int i = 0; i < n; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        // 4. Read elements of arr2
	        System.out.println("Enter elements for array 2:");
	        for (int i = 0; i < n; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        // 5. Read elements of arr3
	        System.out.println("Enter elements for array 3:");
	        for (int i = 0; i < n; i++) {
	            arr3[i] = sc.nextInt();
	        }

	        // 6. Swap: arr1 -> arr2, arr2 -> arr3, arr3 -> arr1
	        for (int i = 0; i < n; i++) {
	            int temp = arr1[i];
	            arr1[i] = arr3[i];  // arr3 → arr1
	            arr3[i] = arr2[i];  // arr2 → arr3
	            arr2[i] = temp;     // arr1 → arr2
	        }

	        // 7. Print results
	        System.out.println("After swapping:");
	        System.out.println("Array 1: " + Arrays.toString(arr1));
	        System.out.println("Array 2: " + Arrays.toString(arr2));
	        System.out.println("Array 3: " + Arrays.toString(arr3));

	        sc.close();
	    }
}
