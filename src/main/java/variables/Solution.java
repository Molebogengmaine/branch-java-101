package variables;

import java.util.Scanner;
import java.util.function.Predicate;

class SolutionOne {
    public static void main(String[] argh) {


      //  Predicate pred = String::compareTo

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                    //Complete the code
                }
                if (x >= -32768 && x <= 32768) {
                    System.out.println("* short");
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");

                }
                if (x >= -9223372036854775808L || x <= 9223372036854775807L) {
                //   nm, koiijnm,lkjhgbnm,.liuytfgv \/'/.;/''/;'']\\]]\'//  System.out.print

                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
