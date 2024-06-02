package org.example.javaBasics.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        SortedSet<String> mySet = new TreeSet<String>();
        mySet.add("Lebo");
        mySet.add("Mo");
        mySet.add("Molebo");
        mySet.add("Mapresh");
        mySet.add("Molebogeng");
        mySet.add("Lebza");
        mySet.add("Mommy");

        System.out.println("Here are my Tree set elements " +
                "in ascending order:");
        for (String myName : mySet){
            System.out.println(myName);
        }
        System.out.println("");
        System.out.println("Adding my son to Tree set:");
        mySet.add("Tshepo");
        for (String names:mySet){
            System.out.println(names);
        }

    }
}
