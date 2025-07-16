public class Ternary {
    public static void main(String[] args) {
        /* ternary on two and three numbers comparison */

        int a = 10;
        int b = 78;
        int c = 88;
        int d = 90;

        /* condition of ternary */

        int res1;
        int res2;
        int res3;

        /* condition for two numbers comparison */

        res1 = (a > b) ? a++ : a--;
        System.out.println("the res after using ternary of two numbers: " + res1);

        /* for three numbers comparison */

        res2 = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("the res after using ternary of three numbers: " + res2);

        /* for four numbers */

        res3 = (a > b ? a : b) > (c > d ? c : d) ? (a > b ? a : b) : (c > d ? c : d);
        System.out.println("the res after using ternary operator is: " + res3);

    }

}