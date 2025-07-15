
public class Widening {
    // widening : implicit : java does it automatically...
    // typecasting concept of conversion of data type smaller to bigger .

    // narrowing : explicit : which is done by user manually,
    // typecasting concept of conversion of data type larger to smaller :

    public static void main(String[] args) {
        // smaller to larger conversion :implicit : widening
        // there is no data loss..

        System.out.println("THIS IS THE EXAMPLE OF WIDENING/ IMPLICIT TYPECASTING : ");

        /* byte to short */
        byte b = 2;
        System.out.println("byte: " + b);
        short s = b;
        System.out.println("conversion of byte to short: " + s);
        /* short to int */
        short s1 = 100;
        int i = s1;
        System.out.println("conversion of short to int: " + i);
        /* int to long */
        int i1 = 90;
        long l = i1;
        System.out.println("conversion of int to long: " + l);
        /* long to float */
        long l1 = 8433333;
        float f = l1;
        System.out.println("conversion of long to float: " + f);
        /* float to double */
        float f1 = 12.78f;
        double d = f1;
        System.out.println("conversion of float to double: " + d);
        /* char to int */
        char c = 'W';
        int i2 = c;
        System.out.println("conversion of char to int: " + i2);

    }
}