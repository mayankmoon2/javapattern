import java.util.Scanner;

public class KeithNumber {

    public static boolean isKeithNumber(int n) {
        String numberStr = String.valueOf(n);
        int[] digits = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        int[] sequence = new int[digits.length];
        System.arraycopy(digits, 0, sequence, 0, digits.length);

        while (true) {
            int nextTerm = 0;
            for (int i = 0; i < sequence.length; i++) {
                nextTerm += sequence[i];
            }

            if (nextTerm == n) {
                return true;
            }

            if (nextTerm > n) {
                return false;
            }

            for (int i = 0; i < sequence.length - 1; i++) {
                sequence[i] = sequence[i + 1];
            }
            sequence[sequence.length - 1] = nextTerm;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            if (isKeithNumber(number)) {
                System.out.println(number + " is a Keith number.");
            } else {
                System.out.println(number + " is not a Keith number.");
            }
        }
    }
}
 
