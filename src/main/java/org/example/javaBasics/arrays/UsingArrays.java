package org.example.javaBasics.arrays;

import java.util.Arrays;

public class UsingArrays {

    public static void main(String[] args) {

        String [] pets = {"parrot","cat","dog"};
        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);
      //  System.out.println(pets[3]);//this throws index out of bounds exception
     //   System.out.println();

        //you can also change the index of the array
        pets[0] = "bird";
  //print array elements using for loop
        for (int i=0; i< pets.length;i++){
            System.out.println(pets[i]);
        }
        for (int i = 0; i <= pets.length -1;i ++){
            System.out.println(pets[i]);
        }
        System.out.println(pets);

        String [] names = new String[6];
        System.out.println(Arrays.toString(names));


        int [] numbers = new int[5];
        for(int i = 0; i<numbers.length;i++){
            numbers[i]  = i + 10;
            System.out.println("new arrays" + Arrays.toString(numbers));
        }
        System.out.println(Arrays.toString(numbers));
    }
}
