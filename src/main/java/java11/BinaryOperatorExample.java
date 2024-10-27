package java11;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        int bin = 0b00000000_00000000_00000000_00000000;
        int bin2 = ~bin;

        System.out.println("bin1 =" + bin + "(" + Integer.toBinaryString(bin) + ")" );
        System.out.println("bin2 =" + bin2 + "(" + Integer.toBinaryString(bin2) + ")" );
    }
}
