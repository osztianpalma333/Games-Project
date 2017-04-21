import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by intern08 on 21.04.2017.
 */
public class GameManager {

    //Attributes
    public ArrayList <Game> games = new ArrayList<>();

    //Methods
    public void addGame(Game game){
        games.add(game);
    }
    public void playGame(Class game){
        for(int index = 0; index < games.size(); ++index)
        {
            if( game.isInstance(games.get(index)) ){
               games.get(index).initGame();
            }
        }

    }

}
