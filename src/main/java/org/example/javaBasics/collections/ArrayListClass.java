package org.example.javaBasics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {


        List<String> pets = new ArrayList<>();

        pets.add("Taio");
        pets.add("Timo");
        pets.add("Timo");
        System.out.println(pets);
        pets.remove("Timo");
        pets.remove("Taio");
        pets.add(0,"ntja");
        pets.add(1,"cat");
        pets.add(3,"dog");
        System.out.println(pets);
    }

}
