package exception;
/*****
 * test for exceptions
 * ***/
public class ExceptionExample {

    public static void main(String[] args) {
        int i ;

        try {
            i = 0;
            System.out.println("i = " + 10/i++);

        } catch (RuntimeException e) {
           // throw new RuntimeException(e);
        }finally {
          //  System.out.println("i = " + i); code does not compile cause i is not initialized
        }
    }
}
