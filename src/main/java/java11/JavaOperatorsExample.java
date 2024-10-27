package java11;

public class JavaOperatorsExample {

    public static void main(String[] args) {
        int b = 5;
        int loopiteratins = 0;

        while (--b > 0){
            loopiteratins ++;
        }

        System.out.println("Prefix decrement operator used,loopiterations = "
        + loopiteratins +",b=" + b);
    }
}
