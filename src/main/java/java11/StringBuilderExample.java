package java11;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder(0);  // Line 1

        String hello = "hello";

        hello.concat(" world");

        builder1.append(hello);//if it was a String it would need a reference
        builder2.append(builder1).append(" world");//e.g var answer = builder.concat(builder).concat(" world)
        /***********
         *
         * PLEASE NOTE StringBuilder object is self referencing therefore anychanges done above will change
         */
        System.out.println(builder1);
        System.out.println(builder2);
    }
}
