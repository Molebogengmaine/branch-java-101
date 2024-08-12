package org.example.javaBasics.arrays;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {

       int [] j = {6};
        for (int i =0; i< j.length; i++){
            System.out.println(j[i]);
        }
        //multiple ways to create an array
        //array with 4 elements
        int[] myNumber = {1, 4, 5, 6, 7};
        String[] names = new String[4];
        double[] salary = {};//anonymous arrays
        double[] d = new double[4 * 5];//creates array with 20 elements

        int x = 4;
        int y = 5;
        double[] dd = new double[x * y];

        int numbers[];//it is allowed but a bad practise

        String[] animals = {"dog", "cat", "cow", "horse"};
        String[] myAnimals = animals;//creating a reference to another object
        String[] otherAnimals = {"Parrot", "rabbit"};

        System.out.println(Arrays.equals(animals, myAnimals));
        System.out.println(animals == myAnimals);
        System.out.println(Arrays.equals(animals,myAnimals));
        System.out.println(animals.equals(otherAnimals));
        System.out.println(Arrays.equals(animals,otherAnimals));
        System.out.println(animals);
        System.out.println(animals.toString());
        System.out.println(Arrays.toString(animals));//this is hpw you print elements in the array

    }

    public int arrays (int [] j){
        for (int i =0; i< j.length; i++){
            System.out.println(j[i]);
        }
        return j.length;
    }

}
