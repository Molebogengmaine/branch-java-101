package org.example.javaBasics.collections;

import java.util.*;

public class IteratingList1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(24);
        numbers.add(25);
        numbers.add(26);
        numbers.add(27);
        numbers.add(28);
        for (int i =0; i<numbers.size();i++){
            System.out.println("element at index" +  " " + i + " " + "is" + " " + numbers.get(i));
        }
        for (Integer number : numbers){
            System.out.println("numbers " + number);
        }

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();){
            Integer numb = iterator.next();
            System.out.println(numb);
            iterator.remove();
        }
        System.out.println(numbers);
        numbers.addAll(Arrays.asList(1,2,3,48,7,6,5));
   //need to fix this
        for (ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasNext();){
            System.out.println(listIterator);
        }
    }
}
