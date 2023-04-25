package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestNumber(21));
        System.out.println(getLargestNumber(217));
        System.out.println(getLargestNumber(0));
        System.out.println(getLargestNumber(45));
        System.out.println(getLargestNumber(-1));
        System.out.println(getLargestNumber(7));
    }

    public static int getLargestNumber(int number) {
        if (number <= 1) {
            return -1;
        }
        boolean primeDivider = false;
        int divider = number;
        while (divider >= 2) {
            if (number % divider == 0) {
                int i = 2;
                while (i <= Math.sqrt(divider)) {
                    if (divider % i == 0) {
                        break;
                    }
                    i += 1;
                }
                if (i > Math.sqrt(divider)) {
                    primeDivider = true;
                    break;
                }
            }
            divider -= 1;
        }
        if (primeDivider) {
            return divider;
        }
        return -1;
    }
}