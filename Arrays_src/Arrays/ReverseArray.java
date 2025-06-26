package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
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

	        // 3. Reverse the array in-place
	        for (int i = 0; i < n / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[n - 1 - i];
	            arr[n - 1 - i] = temp;
	        }

	        // 4. Display the reversed array
	        System.out.println("Reversed array: " + Arrays.toString(arr));

	        sc.close();
	    }
	}

