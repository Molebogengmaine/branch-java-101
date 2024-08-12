package org.example.javaBasics.basics;

public class WrapperTrypes {
    public static void main(String[] args) {


        int myInt = 10;
        Integer myInteger = 10;
        Integer myIntegers = 55;
        Integer myInteger4 = Integer.valueOf(44);
        Integer myInteger5 = Integer.parseInt("89");
        Integer myInteger66 = null;
        // int myInt4 = null;
        System.out.println(myInteger);
        System.out.println(myIntegers);
        System.out.println(myInt);
        System.out.println(myInteger5);
        System.out.println(myInteger66);
        short numbers = 5;

        int myInt3 = myInteger4;//unboxing
//        int myNewInt = myInteger66;//throws null pointer exception
        System.out.println(myInt3);
    }
}
