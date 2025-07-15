package Strings;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Use LinkedHashSet to maintain order and uniqueness
        Set<Character> seen = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            seen.add(ch); // duplicates are ignored automatically
        }
     // Build the result string
        StringBuilder result = new StringBuilder();
        for (char ch : seen) {
            result.append(ch);
        }

        System.out.println("String after removing duplicates: " + result.toString());

        sc.close();
    }
}


