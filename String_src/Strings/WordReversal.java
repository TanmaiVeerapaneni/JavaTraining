package Strings;
import java.util.Scanner;

public class WordReversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.trim().split("\\s+");

        // Reverse the word order
        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}


