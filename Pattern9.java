public class Pattern9 {

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 3; i >= 0; i--) {
            for (int j = 3; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

