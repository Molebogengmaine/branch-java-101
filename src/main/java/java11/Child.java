package java11;//package pkgb;

import inheritance.Parent;/*--------------------------
        AND
        -------------- Child.java source code ------------------

        package pkga;

        import pkgb.inheritance.Parent;*/

public class Child extends Parent {
    static String name = "DEF";  // Line 1
    public void printName() { // Line 2
      // System.out.println(Parent.name);  // Line 3 //private-package
    }
    public static void main(String[] args) {
        int x = 0, y = 6;
       // for (; x<y; x++, y--) {// line 1
        new Child().printName();
    }
}