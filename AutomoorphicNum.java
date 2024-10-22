public class AutomoorphicNum {

    static int countdig(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countdig(num / 10);
    }

    public static void main(String[] args) {
        int num = 25;
        int count = countdig(num);
        int square = (int) Math.pow(num, 2);
        if (num == (square % ((int) Math.pow(10, count)))) {
            System.out.println("yes this is an automorpic");
        }
    }
}
