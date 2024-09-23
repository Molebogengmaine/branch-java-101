package org.example.javaBasics.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C#");
        languages.add("C++");
        languages.add("Swift");
        String specific = languages.get(4);
        languages.remove(2);//removes element at index 2 == c#
        languages.set(1,"AndroidProgramming");
        System.out.println(languages);
        languages.sort(Comparator.naturalOrder());//sorting the list
        System.out.println("Natural Order: " + " " +languages);//print elements in arraylist
        languages.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order: " + " " + languages);
        System.out.println("Specific element:" + " " +specific);
        System.out.println("if element element contains Swift:" + " " +languages.contains("Swift"));
        System.out.println("The size of the arrayList is " + " " +languages.size());
        System.out.println("Check if the list is empty: " + " " +languages.isEmpty());
        int checkIndex = languages.indexOf(9);
        int checkIndex1 = languages.indexOf("Swift");
        System.out.println("get the position of the arraylist element: " + " " +checkIndex);
        System.out.println("get the index of arraylist element: " + " " +checkIndex1);
    }


   /*  //any array of type object is initialized to null
    ArrayListExample[] arrayListExample = new ArrayListExample[5];

    public static void main(String[] args) {

//Before Arrays and ArrayList that's what it solves
        int mark = 9;
        int mark2 = 19;
        int mark3 = 29;
        int mark4 = 39;
        int mark5 = 49;
        int mark6 = 59;
        int mark7 = 69;
        int sum = mark + mark2 + mark3 + mark4 + mark5 + mark6 + mark7;
        //System.out.println(sum);

        //Arrays
        int [] marks  = {9,19,29,39,49,59,69}; //declaring an integer array and initializing
        int [] marks10 = {};//another way to define array
        int [] mark67 = new int[6];//declaring an array with 5 element and all the elements will
        //be initialized to 0


        int addition = 0;
        for (int studentMark : marks){
            addition = addition + studentMark;
        }
       // System.out.println(addition + " " + "The Mark for Molebogeng");
       // System.out.println(marks.length);
        //execise 1
        int [] elementMarks = {2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(elementMarks));
        System.out.println("The length of an array is:" + " " +elementMarks.length);
        for (int markSize : elementMarks){
            System.out.println(markSize);
        }
    }

*/
}
