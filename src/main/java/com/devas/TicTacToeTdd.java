package devas;

import java.util.Scanner;

public class TicTacToeTdd {

    private int sizeX;
    private int sizeY;
    private String[][] board;
    private String playerA = "o";
    private String playerB = "x";
    private String currentTurn = "o";

    public static void main(String[] args) {

        TicTacToeTdd ticTacToeTdd = new TicTacToeTdd();
        ticTacToeTdd.run();


    }

    private void run() {
        System.out.print("Who starts first? Type X or O: ");
        final Scanner scanner = new Scanner(System.in);
        final String startingPlayer= scanner.nextLine();
        if(startingPlayer.equalsIgnoreCase("o")) {
            currentTurn = "o";
        } else {
            currentTurn = "x";
        }

        System.out.print("Size X? ");
        sizeX = scanner.nextInt();
        System.out.print("Size Y? ");
        sizeY = scanner.nextInt();
        board = new String[sizeX][sizeY];

        setBoard("*");

        boolean isFinished = false;
        while (!isFinished) {
            System.out.println("Now plays " + currentTurn);
            showBoard();
            System.out.println("Exit? Y/N ");
            String s = scanner.nextLine();
            if(s.equalsIgnoreCase("y")) {
                break;
            }
            nextTurn();
        }

    }

    private void setBoard(String value) {
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                board[x][y] = value;
            }
        }
    }

    private void showBoard() {
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }

    private String nextTurn() {
        if (currentTurn.equals(playerA)) {
            currentTurn = playerB;
        } else {
            currentTurn = playerA;
        }
        return currentTurn;
    }


}
