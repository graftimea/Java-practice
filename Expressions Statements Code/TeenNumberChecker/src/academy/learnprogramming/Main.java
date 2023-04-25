package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        boolean answer = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(answer);
        answer = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println(answer);
        answer = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(answer);
        answer = TeenNumberChecker.isTeen(9);
        System.out.println(answer);
        answer = TeenNumberChecker.isTeen(13);
        System.out.println(answer);
    }
}