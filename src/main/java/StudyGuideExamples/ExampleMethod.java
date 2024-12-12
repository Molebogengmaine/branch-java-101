package StudyGuideExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
@Exercise
public class ExampleMethod {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("Lebo");
        list.add("Maine");
        list.add("Makoma");
        list.add("Zethu");
        list.add("Phiwo");

        // Object.class.getMethods().hashCode();

        list.sort(Comparator.reverseOrder());

        System.out.println(list);

    }

    public void variables(int a) {

        int b = 1;
      //  Predicate<Integer> p1 = a -> {
       //     int b = 0;
      //      int c = 0;
     //       return b == c;
     //   };
    }
}
