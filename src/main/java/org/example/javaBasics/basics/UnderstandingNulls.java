package org.example.javaBasics.basics;

public class UnderstandingNulls {

    static Object myObject = new Object();
    static Object myOtherObject;
    static String myString;
    public static void main(String[] args) {

        Object myLocalObject = new Object();
        Object anotherLocalObject = null;

        String name = "java";
        String myOtherString = null;
        System.out.println("my object = "+myObject);
        System.out.println("my other object = "+ anotherLocalObject);
        System.out.println("my name = "+ name);
        System.out.println("my other String = "+ myOtherString);
        //myString.toLowerCase();
        System.out.println("my null String = "+ myString);
        System.out.println();
    }
}
