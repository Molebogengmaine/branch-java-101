package java11;

public class StringsTurorial {

    public static void main(String[] args) {

        String s1 = new String("Hello");
        byte[] bytes = {'a','b','c'};String s2 = new String(bytes);
        char[] chars = {'w','e','r','g','f'}; String s3 = new String(chars);
        StringBuilder sb = new StringBuilder("Molebogeng");String s4 = new String(sb);
        String s5 = "hello" + "World";

        System.out.println(s5);


      //  String s = new String("Hello");
     //   System.out.println(s);

       // String s = "Hello";

        // s = s + "Lebo";
      //  s.concat("Lebo");//print Hello cause theres no reference to a new String
      //  s = s.concat("Lebo");//will print hello world cause the results are assigned to a variable that reference it

      //  System.out.println(s);

    }
    public  String getMethodString(){

        return  "Lovey";
    }
}
