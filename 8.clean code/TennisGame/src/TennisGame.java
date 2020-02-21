public class TennisGame {
    private static String score;

    public static void main(String[] args) {
        System.out.println(getScore("haha", "hoho", 1, 2));
    }

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        boolean isEqual = scorePlayer1 == scorePlayer2;
        boolean moreThanFour = scorePlayer1 >= 4 || scorePlayer2 >= 4;

        if (isEqual) {
            return score = whenEqual(scorePlayer1);
        } else if (moreThanFour) {
            return score = whenMoreThanFour(scorePlayer1, scorePlayer2);
        }
        for (int count = 1; count < 3; count++) {
            if (count == 1) tempScore = scorePlayer1;
            else {
                tempScore = scorePlayer2;
                score += "-";
            }
            compareTempScore(tempScore);
        }
        return score;
    }

    private static String whenMoreThanFour(int scorePlayer1, int scorePlayer2) {
        int minResult = scorePlayer1 - scorePlayer2;
        if (minResult >= 2) {
            return score = "win for player 1";
        }
        switch (minResult) {
            case 1:
                return score = "Advantage player1";
            case -1:
                return score = "Advantage player2";
            default:
                return score = "Win for player2";
        }
    }

    private static String whenEqual(int scorePlayer1) {
        switch (scorePlayer1) {
            case 0:
                return score = "Love-All";
            case 1:
                return score = "Fifteen-All";

            case 2:
                return score = "Thirty-All";
            case 3:
                return score = "Forty-All";
            default:
                return score = "Deuce";
        }
    }

    private static void compareTempScore(int tempScore) {
        switch (tempScore) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }
    }
}