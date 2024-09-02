package org.example.javaBasics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingWrappersInList {

    //primitives are not classes cannot be used in Arraylist we need to use Wrappers
   // List<double> pets = new ArrayList<>();
    public static void main(String[] args) {


        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5);//autoboxing
        doubleList.remove(55.12);//autoboxing
        double first = doubleList.get(0);//unboxing

        //searching elements in araylist
        List <String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("70");
        numsList.add("5");
        numsList.add("50");
        numsList.add("5009");
        Collections.sort(numsList);
        System.out.println(numsList);
        int index  = Collections.binarySearch(numsList,"600");
        System.out.println(index);
  //in order to use binary search you need to sort the numbers first
        // other wise it will return negative values
        List<Integer> numbers = Arrays.asList(6,7,3,1,9,8);
        Collections.sort(numbers);
        System.out.println(numbers);
        int indexx = Collections.binarySearch(numbers,6);
        System.out.println(indexx);

    }
}
