package StudyGuideExamples;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {


    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.descendingIterator();
        System.out.println(cars);

        ArrayList<String> carsq = new ArrayList<>();
        carsq.add("Volvo");
        carsq.add("BMW");
        carsq.add("Ford");
        carsq.add("Mazda");
        //carsq.forEach( );
            System.out.println(carsq);

    }
}