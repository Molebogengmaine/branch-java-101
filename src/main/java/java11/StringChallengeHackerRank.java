package java11;

import java.util.Arrays;
import java.util.Scanner;

public class StringChallengeHackerRank {

    public static void main(String[] args) {

        String value = "";
        int number = 0;

        StringChallengeHackerRank stringChallengeHackerRank = new StringChallengeHackerRank();
        stringChallengeHackerRank.getSmallestAndLargest(value, number);

    }

    public String getSmallestAndLargest(String input, int size) {

        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        size = sc.nextInt();

        //char [] subInput = input.toCharArray();
        for (int i = 0; i <= input.length(); i ++) {

            var results = input.substring(i,size);

            System.out.print(" " + results);
        }

        return "";
    }
}
