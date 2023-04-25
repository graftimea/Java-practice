package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int db = 1;
        int sum = 0;
        for(int i=1; i<=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(db + " number: " + i);
                sum += i;
                db++;
                if (db > 5) {
                    break;
                }
            }
        }
        System.out.println("The sum: " + sum);
    }
}