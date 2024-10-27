package java11;

import java.util.Arrays;
import java.util.Scanner;

public class StringsChallenges {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringsChallenges stringsChallenges = new StringsChallenges();
        var answer =  stringsChallenges.checkPalindrome(A);
        System.out.println(answer);

 /*       Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        StringBuilder stringBuilder = new StringBuilder(S);

       String result =  stringBuilder.substring(start,end);//needs a reference

        System.out.println(result);*/


    }

    public String checkPalindrome(String input){

        StringBuilder stringBuilder = new StringBuilder(input);
        String result = String.valueOf(stringBuilder.reverse());//does not need a reference
        if (result.equalsIgnoreCase(input)){
            return  "Yes";
        }else
        {
            return "No";
        }

    }
}
