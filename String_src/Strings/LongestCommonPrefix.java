package Strings;
import java.util.Scanner;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline

        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        // Find longest common prefix
        String lcp = findLongestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + lcp);

        sc.close();
    }

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0]; // Start with the first string

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                // Reduce prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // No common prefix
                }
            }
        }

        return prefix;
    }
}


