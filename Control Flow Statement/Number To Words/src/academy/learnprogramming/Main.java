package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(0);
        numberToWords(10);
        numberToWords(100);
    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int subMax = getDigitCount(number);
            number = reverse(number);
            System.out.println(number);
            int max = getDigitCount(number);
            for (int i = 1; i <= max; i++) {
               System.out.println(i);
               int digit = number % 10;
               switch (digit) {
                   case 0:
                       System.out.println("Zero");
                       break;
                   case 1:
                       System.out.println("One");
                       break;
                   case 2:
                       System.out.println("Two");
                       break;
                   case 3:
                       System.out.println("Three");
                       break;
                   case 4:
                       System.out.println("Four");
                       break;
                   case 5:
                       System.out.println("Five");
                       break;
                   case 6:
                       System.out.println("Six");
                       break;
                   case 7:
                       System.out.println("Seven");
                       break;
                   case 8:
                       System.out.println("Eight");
                       break;
                   default:
                       System.out.println("Nine");
                       break;
               }
               number /= 10;
           }
            if (subMax > max) {
                for (int i = 1; i <= subMax - max; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        int compareNumber;
        if (number >= 0) {
            compareNumber = number;
        } else {
            compareNumber = Math.abs(number);
        }
        while (compareNumber > 0) {
            reverseNumber += compareNumber % 10;
            compareNumber /= 10;
            if (compareNumber > 0) {
                reverseNumber *=10;
            }
        }
        if (number < 0) {
            reverseNumber = reverseNumber - 2* reverseNumber;
        }
        return reverseNumber;
    }
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0){
            number /= 10;
            count = count + 1;
        }
        return count;
    }
}