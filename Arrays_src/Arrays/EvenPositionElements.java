package Arrays;
import java.util.Scanner;

public class EvenPositionElements {
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

	        // 3. Print elements at even positions (index 0, 2, 4,...)
	        System.out.println("Elements at even positions:");
	        for (int i = 1; i < n; i += 2) {
	            System.out.print(arr[i] + " ");
	        }

	        sc.close();
	    }
	}



