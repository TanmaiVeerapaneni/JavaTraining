package Arrays;
import java.util.Scanner;

public class OddPOsitionELements {
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

	        // 3. Print elements at odd positions (index 1, 3, 5, ...)
	        System.out.println("Elements at odd positions:");
	        for (int i = 0; i < n; i += 2) {
	            System.out.print(arr[i] + " ");
	        }

	        sc.close();
	    }
	}


