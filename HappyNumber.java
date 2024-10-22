import java.util.Scanner;

public class HappyNumber {

    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        int count = 0;
        while (n != 1 && count <= 20) {
            n = sumOfSquares(n);
            count++;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            if (isHappy(number)) {
                System.out.println(number + " is a happy number.");
            } else {
                System.out.println(number + " is not a happy number.");
            }
        }
    }
}
        