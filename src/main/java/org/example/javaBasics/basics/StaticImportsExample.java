package org.example.javaBasics.basics;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static org.example.javaBasics.basics.Config.*;

public class StaticImportsExample {

    public static void main(String[] args) {

        int min = min(5,7);
        System.out.println("min =" + min);
        System.out.println(PI);

        printConfig();
        System.out.println("name" + NAME);
        System.out.println("count" + MAX_COUNT);
    }
}
