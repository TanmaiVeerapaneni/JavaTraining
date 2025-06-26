package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class CopyArrayElements {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read size of the array
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        // 2. Create source array and read elements
	        int[] source = new int[n];
	        System.out.println("Enter " + n + " elements for the source array:");
	        for (int i = 0; i < n; i++) {
	            source[i] = sc.nextInt();
	        }

	        // 3. Create destination array and copy elements
	        int[] destination = new int[n];
	        for (int i = 0; i < n; i++) {
	            destination[i] = source[i];
	        }

	        // 4. Print both arrays
	        System.out.println("Source array:      " + Arrays.toString(source));
	        System.out.println("Destination array: " + Arrays.toString(destination));

	        sc.close();
	    }
	}
