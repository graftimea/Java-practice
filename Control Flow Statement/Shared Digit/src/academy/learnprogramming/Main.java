package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10) || (firstNumber > 99) || (secondNumber < 10) || (secondNumber > 99)) {
            return false;
        }
        while (firstNumber > 0) {
            int firstDigit = firstNumber % 10;
            int secondHelperNumber = secondNumber;
            while (secondHelperNumber > 0) {
                int secondDigit = secondHelperNumber % 10;
                if (firstDigit == secondDigit) {
                    return true;
                }
                secondHelperNumber /= 10;
            }
            firstNumber /= 10;
        }
        return false;
    }
}