package lambdaExpressions;

public class AfterLambda {

    public static void main(String[] args) {
        int width = 10;

        Drawable dr = () -> {
            System.out.println("Drawing " + width);
        };
        dr.draw();
    }




}
