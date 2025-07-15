package Strings;
import java.util.Scanner;

public class SubStringFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input main string and substring
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String subStr = sc.nextLine();

        int count = 0;
        int index = 0;

        // Count occurrences of subStr in mainStr
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();  // Move past the last found substring
        }

        System.out.println("Frequency of \"" + subStr + "\" = " + count);

        sc.close();
    }
}


