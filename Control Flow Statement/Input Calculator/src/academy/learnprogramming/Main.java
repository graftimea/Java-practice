package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double count = 0;
        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count += 1;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round(sum / count));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}