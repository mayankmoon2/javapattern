import java.util.Scanner;

public class kapsConstant {

    public static void kapsconst(int n) {
        int count = 0;
        int ascending = sortDigits(n, true);
        int descending = sortDigits(n, false);

        int naya = descending - ascending;
        System.out.println("  " + descending + " - " + ascending + " = " + naya);

        while (naya != 6174 && count <= 100) {
            ascending = sortDigits(naya, true);
            descending = sortDigits(naya, false);

            naya = descending - ascending;

            System.out.println(count + 1 + "  " + descending + " - " + ascending + " = " + naya);
            count++;
        }
    }

    public static int sortDigits(int n, boolean ascending) {
        int[] digits = new int[10];

        while (n > 0) {
            digits[n % 10]++;
            n /= 10;
        }

        int result = 0;
        if (ascending) {
            for (int i = 0; i < 10; i++) {
                while (digits[i] > 0) {
                    result = result * 10 + i;
                    digits[i]--;
                }
            }
        } else {
            for (int i = 9; i >= 0; i--) {
                while (digits[i] > 0) {
                    result = result * 10 + i;
                    digits[i]--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a 4-digit number (e.g., 6178): ");
            int number = scanner.nextInt();

            if (number < 1000 || number > 9999) {
                System.out.println("Please enter a valid 4-digit number.");
            } else {
                System.out.println("Starting with: " + number);
                kapsconst(number);
            }
        }
    }
}