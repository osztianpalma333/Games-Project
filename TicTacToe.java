import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class TicTacToe extends Game {

    //Attributes

    private int x;
    private int y;
    private int dimensionOfTheTable;
    private ArrayList<ArrayList<Integer>> table = new ArrayList<>();

    //Methods

    public void setDimensionOfTheTable(int dimensionOfTheTable){
        this.dimensionOfTheTable = dimensionOfTheTable;
    }

    public void setCoordinates() {
        for (int indexi = 0; indexi < dimensionOfTheTable; ++indexi) {
            table.add(new ArrayList<Integer>());
            for (int indexj = 0; indexj < dimensionOfTheTable; ++indexj) {
                table.get(indexj).add(new Integer(-1));
            }
        }
    }

    public void printTable() {
        for (int indexi = 0; indexi < dimensionOfTheTable; ++indexi) {
            for (int indexj = 0; indexj < dimensionOfTheTable; ++indexj) {
                System.out.print(table.get(indexi).get(indexj) + "   ");
            }
            System.out.print("\n");
        }
    }

    public int verify() {
        return 0;
    }

    public void startGame() {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("You have just selected Tic-Tac-Toe Game. Let's start.");
            System.out.println("Write max score: ");
            int maxScore = Integer.parseInt(rd.readLine());

            setMaxScore(maxScore);
            setPlayersAttributes();
            setDimensionOfTheTable(3);
            setCoordinates();

            int scoreVerify1 = 0, scoreVerify2 = 0;
            while (scoreVerify1 < maxScore && scoreVerify2 < maxScore) {
                String winner;

                int nr = 0;
                while (nr < 9) {

                    System.out.println(getPlayerName() + " :");
                    System.out.print("Row: ");
                    x = Integer.parseInt(rd.readLine());
                    System.out.print("Column: ");
                    y = Integer.parseInt(rd.readLine());

                    int aux = verify();
                    if (aux == 1 || aux == 0) {
                        winner = getPlayerName();
                        setScore(1);
                        scoreVerify1 = getPlayerScore();
                        getTurn();
                        scoreVerify2 = getPlayerScore();
                        System.out.println("Congratulations!\n" + "The winner is: " + winner);
                        printTable();
                        break;
                    }
                    printTable();
                    nr++;
                    getTurn();
                }
                if (nr >= 9)
                    System.out.println("It's a tie!");

            }
        } catch (IOException ex) {
            System.out.print("Error at ticTacToeMain, ex: " + ex.toString());
        }
    }

}

