package academy.learning;

public class Main {
    public static void main(String[] args) {
        boolean answer = EqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println(answer);
        answer = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println(answer);
        answer = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(answer);
    }
}