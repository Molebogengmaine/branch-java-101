package org.example.javaBasics.arrays;

import java.util.Arrays;

public class CommonArraysProblem {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6};

       /* for (int i = 0; i < numbers.length;i++){
            System.out.println(i + "-" + numbers[i]);
        }*/
  // numbers.length()  this is not the method
        for (int i = 1; i <= numbers.length - 1 ; i++){
            System.out.println(i + "-" + numbers[i]);
        }
    }
}
