package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-11));
        System.out.println(isPalindrome(1231));
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int compareNumber = 0;
        if (number >= 0) {
            compareNumber = number;
        } else {
            compareNumber = Math.abs(number);
        }
        while (compareNumber > 0) {
            reverse += compareNumber % 10;
            compareNumber /= 10;
            if (compareNumber > 0) {
                reverse *=10;
            }
        }
        if (reverse == Math.abs(number)) {
            return true;
        } else {
            return false;
        }
    }
}