package StudyGuideExamples;

import java.util.*;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> myExample = new TreeSet<>();
        myExample.add(66);
        myExample.add(79);
        myExample.add(12);
        myExample.add(7);
        myExample.add(3);
        System.out.println(myExample);

        Queue<Integer> myFirstQueue = new LinkedList<>();
        System.out.println(myFirstQueue.poll());
        System.out.println(myFirstQueue.peek());
        System.out.println(myFirstQueue.add(56));
        System.out.println(myFirstQueue.offer(1));
        System.out.println(myFirstQueue);
        System.out.println("***********************************");
        Map<String,String> myFirstMap = new HashMap<>();
        myFirstMap.put("31","Molebogeng");
        myFirstMap.put("10","Tshepo");
        myFirstMap.put("05","Amohelang");
        myFirstMap.put("55","Mama");
        myFirstMap.put("27","Nkele");
        for (String key : myFirstMap.values())
        System.out.println(key);
       // myFirstMap.forEach( () -> x.startsWith("M"));
        System.out.println("***********************************");
        Map<String,String> myFirstTreeMap = new TreeMap<>();
        myFirstTreeMap.put("31","Molebogeng");
        myFirstTreeMap.put("10","Tshepo");
        myFirstTreeMap.put("05","Amohelang");
        myFirstTreeMap.put("55","Mama");
        myFirstTreeMap.put("27","Nkele");
        for (String key : myFirstTreeMap.values())
            System.out.println(key);
        System.out.println("***********************************");

        Map<String,String> myFirstMapVK = new HashMap<>();
        myFirstMapVK.put("31","Molebogeng");
        myFirstMapVK.put("10","Tshepo");
        myFirstMapVK.put("05","Amohelang");
        myFirstMapVK.put("55","Mama");
        myFirstMapVK.put("27","Nkele");
        myFirstMapVK.forEach((k,v) -> System.out.println(v));
           // System.out.println(key);
    }
}
