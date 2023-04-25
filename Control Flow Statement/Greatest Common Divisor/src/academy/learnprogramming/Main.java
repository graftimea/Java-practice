package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
    }
    public static int getGreatestCommonDivisor (int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        int number;
        if (second < first) {
            number = second;
        } else {
            number = first;
        }
        for (int i = number; i > 0; i--) {
            if ((first % i == 0) && (second % i == 0)) {
                number = i;
                break;
            }
        }
        return number;
    }
}