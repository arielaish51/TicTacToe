package TicTacToe;

import java.util.Scanner;

import static TicTacToe.Tools.*;

public class Test {
    public static void main(String[] args) {
        letsPlay();
    }
    public static void letsPlay() {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[3][3];
        WelcomeParty(board);
        TheGameProcess(board);

    }

}
