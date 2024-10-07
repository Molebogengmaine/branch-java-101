package lambdaExpressions;
/******
 this was before lambda was introduced
 * ****/
public class BeforeLambda {


    public static void main(String[] args) {


        int width = 10;

        Drawable dr = new Drawable() {    //anonymous class to access draw method
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        dr.draw();
    }

}
