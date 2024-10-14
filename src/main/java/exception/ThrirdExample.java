package exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*****
 * Hacker Rank challenges
 */
public class ThrirdExample {


    public static void main(String[] args) {
//2147483648
        long max = 2147483648L;
        try
        {
            Scanner obj = new Scanner(System.in);
            int firstInput = obj.nextInt();// Read user input
            int secondInput = obj.nextInt();
            int answer = firstInput/secondInput;
            System.out.println(answer);
            obj.close();

        } catch ( ArithmeticException  | InputMismatchException e) {

            System.out.println(e);
        }
    }
}
