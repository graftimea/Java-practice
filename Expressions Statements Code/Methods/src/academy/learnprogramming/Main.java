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

        int highScore = calculateScore(true, 800, 5,100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true,10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", score);

        score = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", score);

        score = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", score);

        score = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", score);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
       if (playerScore >= 1000) {
           return 1;
       } else if (playerScore >= 500) {
           return 2;
       } else if (playerScore >= 100) {
           return 3;
       } else {
           return 4;
       }
    }
}