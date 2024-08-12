package org.example.javaBasics.basics;

public class VariableScope {
    static int myNewInt = 5;
    public static void main(String[] args) {
         int myLocalInt = 10;
        {
            //inner code block
           int myOtherInt = 20;
            System.out.println(myOtherInt);
            System.out.println(myLocalInt);
            System.out.println(myNewInt);
        }
        System.out.println(myLocalInt);
        System.out.println(myNewInt);
//        System.out.println();
    }
}
