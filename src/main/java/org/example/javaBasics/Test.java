/*
package org.example.javaBasics;

import pkga.SuperClass;

public class Test extends SuperClass {
    */
/*****encapsulation example in java 11******//*

    protected static void testMe() { System.out.println("Test"); }

    public static void main(String[] args) {
        testMe();  // Line 3
       // super.testMe();  // Line 4   //but it is not the only compiler error. You cannot use 'super' in
        // a static method. You could replace this line of code with "SuperClass.testMe();"
    }

// here is an implied call to super() but that call fails because
// the no args constructor of the super class(on SuperClass) has no modifier, which means
// it is package by default. The class Test cannot access the constructor because
// it is not in the same package, even though it extends SuperClass. Changing the modifier of the no args constructor
// on SuperClass to protected (or public) would make the code work and the output would be: hello.
   */
/* private String text;   // Line 2
    Test(String text ) {   //Line 3
        setText(text);
    }
    public void setText(String text) { this.text = text; }

    public static void main(String[] args) {
        System.out.println(new Test("text"));  // Line 4
    }*//*

}
*/
