package org.example.javaBasics.basics;

public class WholeNumericPrimitives {

    public static void main(String[] args) {

//        hexadecimal floating or double example
        double hexP1 = 0x1.91eb85eb851fp1;//p indicates hexadecimal floating number
        System.out.println(hexP1);
        long max = 3_212_345_6789L;
        float myNumber = 11.5F;
        double myNumbers = 11.5F;
        double myNumberss = 11.5d;//d can be used for double and its optional
        double myNum = 11.5;
        /**
         * scientific notation below examples do compile and are the same
         */
        //NB scientific applies only to E letter not other alphabets
        double scientific = 5.00012E03;
        double scientific2 = 5.00012E3;
        double myDouble = 5000.123;
        System.out.println(scientific);
        System.out.println(scientific2);
        System.out.println(myDouble);

//        double mmyNum = 11._5;//illegal underscore
//        double MMmyNum = _11.5;//illegal underscore
//        double num = 11.5_;//does not compile
        int oct = 07;
        int firstOct = 010;
        int secondOct = 022;
        int sum = firstOct + secondOct;
        System.out.println("total oct =" + Integer.toOctalString(sum));
    }
}
