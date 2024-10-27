package java11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramsHackerRank {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();  // Read user input
        String secondString = scanner.nextLine();

        AnagramsHackerRank anagramsHackerRank = new AnagramsHackerRank();
        anagramsHackerRank.test(userName, secondString);

    }

    public String test(String first, String first2) {
        if (first.length() == first2.length()) {


            first = first.toLowerCase(Locale.ROOT);
            first2 = first2.toLowerCase(Locale.ROOT);

            char[] test1Char = first.toCharArray();
            char[] test2Char = first2.toCharArray();

            Arrays.sort(test1Char);
            Arrays.sort(test2Char);

            if (Arrays.equals(test1Char, test2Char)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }
        return "Anagram";

    }


}
