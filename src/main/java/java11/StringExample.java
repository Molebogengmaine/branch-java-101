package java11;

public class StringExample {

    static String s;
    public static void main(String[] args) {

        String s;
        boolean isOk=true;
        if (isOk) s = StringExample.s+"";  // Line 1
        else s="";
        s.concat("Hello ");  // Line 2
        s.concat("World");
        s.toUpperCase();
        System.out.println("s = "+s);

    }
}

   /* public static void main(String[] args) {
        String hello = "hello";

        for (var arg : args) {  // Line 2
            String sb = new String(arg); // Line 3
            System.out.print(arg.equals(sb) + " ");  // Line 4
            System.out.print((hello.equals(arg)) + " ");  // Line 5
            System.out.println( (hello.equals(arg.intern()))); // Line 6
        }
    }*/

