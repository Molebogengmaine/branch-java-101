package exception;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Anotherexample {

    public static void main(String[] args) {

        Anotherexample er = new Anotherexample();
        er.getPlayerScore("Lebo");
    }

    public int getPlayerScore(String playerFile) {
        try (Scanner contents = new Scanner(new File(playerFile))) {
            return Integer.parseInt(contents.nextLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
          //  logger.warn("Failed to load score!", e);
            return 0;
        }
    }
}
