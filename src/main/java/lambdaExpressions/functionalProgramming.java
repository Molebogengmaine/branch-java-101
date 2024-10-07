package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class functionalProgramming {


    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(5);
        myNumbers.add(7);
        myNumbers.add(55);
        myNumbers.add(59);
        myNumbers.add(89);
        myNumbers.add(11);
        Consumer<Integer> method = System.out::println;
        myNumbers.forEach(method);
      //  myNumbers.forEach( n -> System.out.println(n));
       // System.out.println(myNumbers);
    }
}
