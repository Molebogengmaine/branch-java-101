package org.example.javaBasics.javaoperators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int result = 3 -2 + 2 * 2 + 3;
//        3 - 2 + 4 + 3
//        1 + 4 + 3
//        5 + 3
//        8
        System.out.println(result);

        result = 4 / 2 + 1 - 4 * 2 + 10;
        // 2 + 1 - 8 + 10
//        3  - 8 + 10
//        -5 + 10
//        5
        System.out.println(result);

        int a = 4;
        int b = 3 -2 * --a;//decrement first  then use variable
//        3 - 2 * 3
//        3 - 6
//        -3
        System.out.println("a=" + a + " b=" + b);
        a = 4;
        b = 3 - 2 * a --;

        System.out.println("a=  " + a + " b= " + b);


        long c = 2;
        long d = 4 + 3 * c++;//increment after operation
        System.out.println("c=  " + c + " d= " + d);

        result = 10 -3 * (2 + 1) -4/ (1+3);

//  10 - 3 * 3 - 4 / 4
//  10 - 9 -1
//        0
        System.out.println(result);
        /**
         * modulus TODO
         */
        int i = 10;
        int j = 3;

        int k = i%j;
        int e = 10 % 2;



    }
}
