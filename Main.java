import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Palma on 4/20/2017.
 */
abstract class Main extends Game {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        GameManager games = new GameManager();
        games.addGame(DartsTable);
        games.addGame(TicTacToe);

        System.out.println("Welcome!\nPlease choose the type of the game.\nDarts: 1\nTic-Tac-Toe: 2");
        int index = Integer.parseInt(rd.readLine());
        if (index == 1) {
            games.playGame(DartsTable.class);
        } else {
            games.playGame(TicTacToe.class);
        }
    }
}
