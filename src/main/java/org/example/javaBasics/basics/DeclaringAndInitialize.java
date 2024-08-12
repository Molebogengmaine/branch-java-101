package org.example.javaBasics.basics;

public class DeclaringAndInitialize {
    public static void main(String[] args) {
        int myNumber;//declaring a variable
        myNumber = 15;//initializing the number;
        System.out.println(myNumber);

        double myDouble = 7.00;
        System.out.println(myDouble);
        float myFloat1,myFloat2,myFloat3;//you can declare multiple variables in one line separated by a comma
        float myFloat5 =7,myFloat6=8,myFloat7=9;//this is also allowed declaring and initializing variables on one line
       // double d1,double d2;//this does not compile
//        int i3;i4;//this will not compile cause we broken the first statement by using a semicolon instead of a comma
    }



}
