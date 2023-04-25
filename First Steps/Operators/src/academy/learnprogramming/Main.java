package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 =" + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("10 / 5 = " + 2);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 3;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("and I am scared of aliens.");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen!");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        System.out.println(isEighteenOrOver);

        double v1 = 20.00;
        double v2 = 80.00;
        double f3 = (v1 + v2)*100.00;
        double f4 = f3 % 40.00;
        boolean f5 = (f4 == 0) ? true : false;
        System.out.println(f5);
        if (!f5) {
            System.out.println("Got some remainder!");
        }
    }
}