package java11;

public class StringGetCharExample {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder(5);  //  Line 1
        builder.append("abcdefghijklmnopqrstuvwxyz");//  Line 2
        char [] myTestChar = new char[6];
        //System.out.println(myTestChar);
        char[] myCharArray;                                     //  Line 3
        if ("hello" == "hello") myCharArray = new char[5];
           builder.getChars(0, 5, new char[5], 0);  //  Line 4
        System.out.println(new String(myCharArray).trim() + "*"); // Line 4

        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(myArray);

        String myStr = "Hello, World!";
        myStr.getChars(7, 12, myArray, 4);
        /***********
         * start == 7 == specifies the position of the first  characters to be copied
         * end == 12  == specifies the position of the end  characters to be copied
         * destination == myArray == The array to which the characters are copied
         * position== 4 == The position in the destination arrays to which the copied characters are written
         */
       System.out.println(myArray);
    }

}
