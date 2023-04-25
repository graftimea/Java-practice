package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1532));
        System.out.println(sumFirstAndLastDigit(153));
        System.out.println(sumFirstAndLastDigit(15));
        System.out.println(sumFirstAndLastDigit(1));
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            if ((sum == 0) || (number < 10)) {
                sum += digit;
            }

            number /= 10;
        }
        return sum;
    }
}