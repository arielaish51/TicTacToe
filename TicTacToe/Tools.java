package TicTacToe;

import java.util.Scanner;

public class Tools {

    public static void boardInitializew(String[][]board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null)
                    board[i][j] = " ";
            }
        }
    }

    public static void boardInitialize(String[][]board){
        for (int i =0;i< board.length;i++){
            for (int j=0;j<board[i].length;j++){
                if(board[i][j]==null)
                    board[i][j]=" ";
            }
        }
        for (int i =0;i< board.length;i++){
            System.out.print("|");
            for (int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
    public static void WelcomeParty(String[][]board){
        int counter=1;
        System.out.println("Welcome to TicTacToe Party");
        System.out.println(" choosing a number to fill the board like the next constructions:");
        for (int i =0;i< board.length;i++){
            System.out.print("|");
            for (int j=0;j<board[i].length;j++){
                System.out.print(counter+"|");
                counter++;
            }
            System.out.println();
        }
    }
    public static boolean IfWins(String[][]board){
        if((board[0][0]==board[0][1]&&board[0][1]==board[0][2]&&board[0][0]!=" ")){
            boardInitialize(board);
            System.out.println("Player "+ board[0][0]);
            return true;
        }else if( (board[1][0]==board[1][1]&&board[1][1]==board[1][2]&&board[1][0]!=" ")){
            boardInitialize(board);
            System.out.println("Player "+ board[1][0]);
            return true;
        }else if( (board[2][0]==board[2][1]&&board[2][1]==board[2][2]&&board[2][0]!=" ")){
            boardInitialize(board);
            System.out.println("Player "+ board[2][0]);
            return true;
        }else if( (board[0][0]==board[1][0]&&board[1][0]==board[2][0]&&board[0][0]!=" ")){
            boardInitialize(board);
            System.out.println("Player "+ board[0][0]);
            return true;
        }else if( (board[0][1]==board[1][1]&&board[1][1]==board[2][1]&&board[0][1]!=" ")){
            boardInitialize(board);
            System.out.println("Player "+ board[0][1]);
            return true;
        }else if(   (board[0][2]==board[1][2]&&board[1][2]==board[2][2]&&board[0][2]!=" ")){
            boardInitialize(board);
            System.out.println("Player "+ board[0][2]);
            return true;
        }else if(  (board[0][0]==board[1][1]&&board[1][1]==board[2][2]&&board[1][1]!=" ")){
            boardInitialize(board);
            System.out.println("Player "+ board[1][1]);
            return true;
        }else if( (board[2][0]==board[1][1]&&board[1][1]==board[0][2]&&board[2][0]!=" ")){
            boardInitialize(board);
            System.out.println("Player "+ board[2][0]);
            return true;
        }
        else {
            return false;
        }
    }
    public static void TheGameProcess(String[][]board){
        Scanner scanner=new Scanner(System.in);
        boardInitializew(board);
        int counter = 0;
        while (!Tools.IfWins(board)) {

            if (counter % 2 == 0) {
                System.out.println("Player(X) it's your turn:");
            } else {
                System.out.println("Player(Y) it's your turn:");
            }
            System.out.println();
            boardInitialize(board);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    if (board[0][0] == " " &&counter%2==0) {
                        board[0][0] = "X";
                        counter++;
                    }else if (board[0][0] == " " && counter%2!=0) {
                        board[0][0] = "Y";
                        counter++;
                    } else {
                        System.out.println("this chamber is already taken,choose another chamber");
                    }
                    break;
                case 2:
                    if (board[0][1] == " " &&counter%2==0) {
                        board[0][1] = "X";
                        counter++;
                    }else if (board[0][1] == " " && counter%2!=0) {
                        board[0][1] = "Y";
                        counter++;
                    } else {
                        System.out.println("this chamber is already taken,choose another chamber");
                    }
                    break;
                case 3:
                    if (board[0][2] == " " &&counter%2==0) {
                        board[0][2] = "X";
                        counter++;
                    }else if (board[0][2] == " " && counter%2!=0) {
                        board[0][2] = "Y";
                        counter++;
                    } else {
                        System.out.println("this chamber is already taken,choose another chamber");
                    }
                    break;
                case 4:
                    if (board[1][0] == " " &&counter%2==0) {
                        board[1][0] = "X";
                        counter++;
                    }else if (board[1][0] == " " && counter%2!=0) {
                        board[1][0] = "Y";
                        counter++;
                    } else {
                        System.out.println("this chamber is already taken,choose another chamber");
                    }
                    break;
                case 5:
                    if (board[1][1] == " " &&counter%2==0) {
                        board[1][1] = "X";
                        counter++;
                    } else if (board[1][1] == " " && counter%2!=0) {
                        board[1][1] = "Y";
                        counter++;
                    }else {
                        System.out.println("this chamber is already taken,choose another chamber");
                    }
                    break;
                case 6:
                    if (board[1][2] == " " &&counter%2==0) {
                        board[1][2] = "X";
                        counter++;
                    }else if (board[1][2] == " " && counter%2!=0) {
                        board[1][2] = "Y";
                        counter++;
                    }else {
                        System.out.println("this chamber is already taken,choose another chamber");
                    }
                    break;
                case 7:
                    if (board[2][0] == " " &&counter%2==0) {
                        board[2][0] = "X";
                        counter++;
                    }else if (board[2][0] == " " && counter%2!=0) {
                        board[2][0] = "Y";
                        counter++;
                    } else {
                        System.out.println("this chamber is already taken,choose another chamber");
                    }
                    break;
                case 8:
                    if (board[2][1] == " " &&counter%2==0) {
                        board[2][1] = "X";
                        counter++;
                    } else if (board[2][1] == " " && counter%2!=0) {
                        board[2][1] = "Y";
                        counter++;
                    }else {
                        System.out.println("this chamber is already taken,choose another chamber");
                    }
                    break;
                case 9:
                    if (board[2][2] == " " &&counter%2==0) {
                        board[2][2] = "X";
                        counter++;
                    }else if (board[2][2] == " " && counter%2!=0) {
                        board[2][2] = "Y";
                        counter++;
                    } else {
                        System.out.println("this chamber is already taken,choose another chamber");
                    }
                    break;
                default:
                    System.out.println("choose again correct number");
            }
        }
    }
}
