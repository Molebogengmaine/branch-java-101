package org.example.javaBasics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CommonCollectionsMethods {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Collection<String> list = Arrays.asList("Molebogeng","Tshepo","Amohelang");
      //  list.add(collection.toString());
        System.out.println(list);

    }
}
