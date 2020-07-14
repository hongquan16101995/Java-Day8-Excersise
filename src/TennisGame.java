public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1_score, int player2_score) {
        String score = "";
        if (player1_score == player2_score) {
            score = getString(player1_score);
        }
        else if (player1_score >= 4 || player2_score >= 4) {
            score = getStringWin(player1_score, player2_score);
        }
        else {
            score = getString2(player1_score, player2_score, score);
        }
        return score;
    }


    private static String getString2(int player1_score, int player2_score, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1_score;
            }
            else {
                score += "-";
                tempScore = player2_score;
            }

            score = getStringByTempScore(score, tempScore);
        }
        return score;
    }


    private static String getStringByTempScore(String score, int tempScore) {
        switch(tempScore) {
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
        return score;
    }


    private static String getStringWin(int player1_score, int player2_score) {
        String score;
        int minusResult = player1_score - player2_score;
        if (minusResult==1) {
            score = "Advantage player1";
        } else if (minusResult ==-1) {
            score = "Advantage player2";
        }
        else if (minusResult>=2) {
            score = "Win for player1";
        }
        else
            score = "Win for player2";
        return score;
    }


    private static String getString(int player1_score) {
        String score;
        switch (player1_score) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
