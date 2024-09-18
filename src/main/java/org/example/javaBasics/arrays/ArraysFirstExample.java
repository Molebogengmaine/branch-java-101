package org.example.javaBasics.arrays;

import java.util.Arrays;
//public class ArraysFirstExample {
    /**********Java 11 example test examples***************/
    class AppTest {
        static String AppName = "Great";
        final static String goodName = "Good";
        final static String greatName = AppName;  // Line 1

        static {
            AppName += " Name";   // Line 2
        }

        final static String badName = AppName;   // Line 3
    }

 class Test {
    public static void main(String[] args) {

        AppTest t = null;
        System.out.println(t.goodName);
        System.out.println(t.greatName);
        System.out.println(t.badName);
    }
}
   /*  class Test {
        String getMyName() {
            return myName;   // Line 1
        }

        static String myName = "Test";

        public static void main(String[] args) {

            try {
                Test t1 = new Test();
                Test t2 = null;
                System.out.print(Test.myName);
                System.out.print(t1.myName);  // Line 2
                System.out.print(t1.getMyName());

                System.out.print(t2.myName);  // Line 3
                System.out.print(t2.getMyName());    // Line 4
            } catch (Exception e) {
                System.out.println();
            }
        }
    }*/

    //Correct Answer: None of the other methods match, so even though methods with var args aren't matched until phase 3 of method matching, this method matches both calls in the code.
   /*  class Test {
        public static void main(String[] args) {
            Test t = new Test();
            char c = 'a';
            int i = 10;
            t.printMethod(i, c);
            t.printMethod(c, i);
        }

        public void printMethod(int a, Long b) {   // Method 1
            System.out.println("Method (int, Long) called");
        }

        void printMethod(short a, Character b) {  // Method 2
            System.out.println("Method (short, Character) called");
        }

        void printMethod(int... a) {   // Method 3
            System.out.println("Method (int...) called");
        }
    }*****/


   /* public class Test {
        String name;
        int age;

        Test(String name) {
            this.name = name;
        }

        void Test(String name, int age) { // Line 1
            this.name = name;
            this.age = age;
        }

        static public void main(String[] args) {
            Test a = new Test(); // Line 2
            Test b = new Test("Mary");  // Line 3
            Test c = new Test("Mary", 25);  // Line 4
            b.Test("Mary", 25);  // Line 5
        }
    }*/
    //method overloading
   /* static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}

    public static void main(String[] args) {
        System.out.println(ArraysFirstExample.add(11,11));
        System.out.println(ArraysFirstExample.add(11,11,11));

    }*/


   /* class MethodTest {
        public void methodA(boolean flag) {
            if (!flag) return;   // Line 1
            System.out.print("four");

        }  // Line 2

        public String methodB(boolean flag, String values) {
            if (!flag) return;  // Line 3
            String a = "";
            String[] vals = values.split(",");
            for (var val : vals) {   // Line 4
                a += val;
            }
            return a;  // Line 5
        }
    }

    public class Test {
        public static void main(String[] args) {
            MethodTest t = new MethodTest();
            System.out.print(t.methodB(true, "one, two, three "));
            t.methodA(true);
        }
    }*/


  /*  class SuperTest {

    }

    public class Test extends SuperTest {
        int first, second, third;

        public Test(int x, int y) {
            first = x;
            second = y;
        }

        public Test(int x) {
            super(x);
        }
    }*/

  /*  public static void main(String[] args) {

        int[][] spreadsheet = new int[3][];
        spreadsheet[0] = new int[3];//index 0 is initialized to new int which will result as 000
        spreadsheet[1] = new int[]{1, 2, 3}; // Line 1 ///index 1 is initialized to  123
        // spreadsheet[2] is an uninitialized element, so null is the way it would get printed.
        System.out.println(Arrays.deepToString(spreadsheet)); // Line 2

    }*/

       /* public static void main(String[] args) {

            int[] aArray = new int[3];
            Integer[] bArray = new Integer[3];
            aArray[2] = 1;
            bArray[0] = 1;  // Line 1

            for (int a : aArray) {
                System.out.print(a + " ");
            }
            System.out.println("");
            for (var b : bArray) {  // Line 2
                System.out.print(b + " ");  // Line 3
            }

        }*/


//}
