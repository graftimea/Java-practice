package academy.learnprogramming;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int years = (int) minutes / 60 /24 /365;
            int days = (int) (minutes - years * 365 * 24 * 60) / 60 / 24;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
