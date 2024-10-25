package java11;

public class ManipulatingStrings {

    public static void main(String[] args) {


        /***
         *  %d is for intergers
         *  %s s for String
         *  %f is for float
         * ****/
        String x = "Molebogeng Precious Maine      ";
        StringBuilder sb = new StringBuilder(x);
        //sb.reverse();
        sb.trimToSize();
        System.out.println(sb);//to reverse we need to use String builder

        //System.out.println();

       // System.out.println(x.trim());
       // for (char c : x.toCharArray()){
       //     System.out.print(c);
       // }
        String surname = "Molebogeng is %d years Old";
        int age = 31;
        System.out.printf(surname,age);

        System.out.println(x.toUpperCase());
        //System.out.printf(x);//printf is for formatting the string
        System.out.println(x.replace('g','t'));
        System.out.println(x.indexOf("P"));//returns the position of the character
        System.out.println(x.length());//to determine the length of the string
        System.out.println(x.charAt(9));//i can access individual character in a string using x as a reference
    }


}
