package lambdaExpressions;

/******
 with the help of lambda
 */
public class AfterLambda {

    public static void main(String[] args) {
        int width = 10;

        Drawable dr = () -> {     //no parameter example
            System.out.println("Drawing " + width);
        };
        dr.draw();
    }




}
