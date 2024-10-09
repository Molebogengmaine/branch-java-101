package variables;

public class TestExample {

    static  int i ;

   /* public static void main(String[] args) {
        int i,j ,k = 10;
        i = TestExample.i + k;
        k = i+++k;
        TestExample.i = j+ i;

    }*/

    public static void main(String[] args) {

        boolean input1 = true, input2 = false;
        boolean result1 = input1 = !input1;
        boolean result2 = input2 = input1;
        boolean result3 = input1 == (result1 =! input2);
        System.out.println(input1 + "" + input2 + "" + result2 + ""+ result3);
    }
}
