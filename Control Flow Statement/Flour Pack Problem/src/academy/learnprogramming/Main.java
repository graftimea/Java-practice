package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println(canPac(1, 0, 4));
        System.out.println(canPac(1, 0, 5));
        System.out.println(canPac(0, 5, 4));
        System.out.println(canPac(2, 2, 11));
        System.out.println(canPac(-3, 2, 11));
    }

    public static boolean canPac(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        if (bigCount * 5 + smallCount * 1 < goal) {
            return false;
        }

        int goalTester = goal;
        int bigCountTester = bigCount;
        int smallCountTester = smallCount;
        while ((goalTester >= 5) && (bigCountTester > 0)) {
            goalTester -= 5;
            bigCountTester -= 1;
        }
        while ((goalTester > 0) && (smallCountTester > 0)) {
            goalTester -= 1;
            smallCountTester -= 1;
        }
        if (goalTester == 0) {
            return  true;
        }
        return  false;
    }
}