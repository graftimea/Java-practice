package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if ((isValid(firstNumber)) && (isValid(secondNumber)) && (isValid(thirdNumber))) {
            int firstLastDigit = firstNumber % 10;
            int secondLastDigit = secondNumber % 10;
            int thirdLastDigit = thirdNumber % 10;
            if ((firstLastDigit == secondLastDigit) || (firstLastDigit == thirdLastDigit)
                    || (secondLastDigit == thirdLastDigit)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        if ((number < 10) || (number > 1000)) {
            return false;
        }
        return true;
    }
}
