public class Pattern {
    public static void main(String[] args) {
        int n = 8;
        int i;
        for (i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
