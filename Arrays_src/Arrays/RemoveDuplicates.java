package Arrays;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;

public class RemoveDuplicates {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read array size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        // 2. Read array values
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3. Remove duplicates using LinkedHashSet to maintain insertion order
	        Set<Integer> unique = new LinkedHashSet<>();
	        for (int num : arr) {
	            unique.add(num);
	        }

	        // 4. Convert back to array (optional)
	        Integer[] result = unique.toArray(new Integer[0]);

	        // 5. Output result
	        System.out.println("Array after removing duplicates: " + Arrays.toString(result));

	        sc.close();
	    }
	

}
