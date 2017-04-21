import java.util.ArrayList;
import java.util.Random;

public class Player {

    //Attributes
    private String name;
    private int score = 0;

    //Methods

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setAddMoreScore(int currentScore) {
        score += currentScore;
    }

    public int getCurrentPlayerScore() {
        return score;
    }

    public String getCurrentPlayerName() {
        return name;
    }



}
