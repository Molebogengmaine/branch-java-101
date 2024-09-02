package org.example.javaBasics.collections;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods {
    public static void main(String[] args) {

        List<String> pets = new ArrayList<>();

        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        if (pets.size() == 0){
            System.out.println("No pets available");
        }

        pets.add("cat");
        System.out.println(pets.size());
        if (pets.size() >0){
            System.out.println(pets);
        }
        pets.clear();
        System.out.println(pets);

        pets.add("dog");
        System.out.println(pets.contains("dog"));
        List<String> newPets = new ArrayList<>();
        newPets.add("dog");
        System.out.println(pets.equals(newPets));


    }
}
