public class pattern11 {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 0 || j == 4 || i == n || i == 2 * n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
