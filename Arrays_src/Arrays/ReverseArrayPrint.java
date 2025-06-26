package Arrays;
import java.util.Scanner;

public class ReverseArrayPrint {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read array size
	        System.out.print("Enter size of the array: ");
	        int n = sc.nextInt();

	        // 2. Read array elements
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3. Print elements in reverse order
	        System.out.println("Array elements in reverse order:");
	        for (int i = n - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }

	        sc.close();
	    }
	}



