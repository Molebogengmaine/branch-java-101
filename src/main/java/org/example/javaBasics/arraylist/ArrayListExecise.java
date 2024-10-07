package org.example.javaBasics.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExecise {
    public static void main(String[] args) {


        ArrayList<String> blist = new ArrayList<>(List.of("A", "B", "C", "D"));
        String[] bArray = blist.toArray(blist.toArray(new String[5]));
        ArrayList<String> cList = new ArrayList<String>(List.of(bArray));
        cList.add("E");
        System.out.println(cList);

        //List.copyOf()
    }

}
