
public class Narrowing {

    // narrowing : explicit : which is done by user manually,
    // typecasting concept of conversion of data type larger to smaller :

    public static void main(String[] args) {
        // larger to smaller conversion :explicit : narrowing

        System.out.println("THIS IS THE EXAMPLE OF NARROWING(EXPLICIT TYPECASTING");

        /* double to float */
        double d = 24.876;
        System.out.println("double val: " + d);
        float f = (float) d;
        System.out.println("conversion of double to float: " + f);
        /* float to long */
        float f1 = 10.86f;
        long l = (long) f1;
        System.out.println("conversion of float to long: " + l);
        /* long to int */
        long l1 = 907226266;
        int i = (int) l1;
        System.out.println("conversion of long to int: " + i);
        /* int to char */
        int i1 = 84;
        char c = (char) i1;
        System.out.println("conversion of int to char: " + c);
        /* char to short */
        char c1 = 'A';
        short s = (short) c1;
        System.out.println("conversion of char to short: " + s);
        /* short to byte */
        short s1 = 55;
        byte b = (byte) s1;
        System.out.println("conversion of short to byte: " + b);
        /* int to short */
        int i2 = 65000;
        short s2 = (short) i2;
        System.out.println("conversion of int to short: " + s2);
        /* double to int */
        double d1 = 67.99;
        int i3 = (int) d1;
        System.out.println("conversion of double to int: " + i3);
        /* float to byte */
        float f2 = 78.89f;
        byte b2 = (byte) f2;
        System.out.println("conversion of float to byte: " + b2);

    }
}