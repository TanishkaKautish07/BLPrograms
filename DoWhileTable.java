public class DoWhileTable {
    public static void main(String[] args) {
        int a = 2;
        int i = 1;
        do {
            System.out.println(a + "*" + i + "=" + a * i);
            i++;
            if (i > 10) {
                break;
            }

        } while (true);
    }
}