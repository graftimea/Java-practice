package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

 /*       if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000.");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000.");
        } else {
            System.out.println("Got here.");
        }*/

        calculateScore(true, 800, 5,100);

        calculateScore(true,10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}