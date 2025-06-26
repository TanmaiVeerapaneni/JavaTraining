package Arrays;
import java.util.Scanner;

public class ElementFrequency {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read array size
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();

	        // 2. Read array elements
	        int[] arr = new int[n];
	        boolean[] visited = new boolean[n];  // to mark counted elements

	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            visited[i] = false;
	        }

	        // 3. Count frequency
	        System.out.println("Element - Frequency");
	        for (int i = 0; i < n; i++) {
	            if (visited[i])
	                continue;

	            int count = 1;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    visited[j] = true; // mark as counted
	                }
	            }

	            System.out.println(arr[i] + " - " + count);
	        }

	        sc.close();
	    }
	}



