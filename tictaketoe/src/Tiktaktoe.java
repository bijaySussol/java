import java.util.Random;
import java.util.Scanner;

public class TikTakToe {

    private static void printBoard (char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1]+ "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1]+ "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1]+ "|" + board[2][2]);
    }
    private static void playerMove (char[][] board, Scanner scanner) {
        String userInput;
        while(true) {
            System.out.println("play? (1 - 9)");
            userInput = scanner.nextLine();
            if(isValidMove(board,userInput)) {break;} else {System.out.println(userInput+ " is not a valid move.");}
        }
        placeMove(board, userInput, 'x');
    }
    private static boolean isValidMove (char[][] board, String position){
        switch (position) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }
    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println(":(");
        }
    }
    private static void computerMove(char[][] board) {
        Random random = new Random();
        int computerMove;
        while(true) {
            computerMove = random.nextInt(9) + 1;
            if(isValidMove(board, Integer.toString(computerMove))) {break;} else {System.out.println(computerMove+ " is not a valid move.");}
        }
        System.out.println("Compuetr choose: "+computerMove);
        placeMove(board, Integer.toString(computerMove), 'o');
    }
    private static boolean isGameOver(char[][] board) {
        if(whoWon(board, 'x')) {
            printBoard(board);
            System.out.println("Player won!");
            return true;
        }
        if(whoWon(board, 'o')) {
            printBoard(board);
            System.out.println("Computer won!");
            return true;
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == ' ') {
                    return false;
                } 
            }
        }
        printBoard(board);
        System.out.println("Is a tie!");
        return true;
    }
    private static boolean whoWon(char[][] board, char symbol) {
        if ((board[0][0] == symbol) && (board[0][1] == symbol) && (board[0][2] == symbol) ||
        (board[1][0] == symbol) && (board[1][1] == symbol) && (board[1][2] == symbol) ||
        (board[2][0] == symbol) && (board[2][1] == symbol) && (board[2][2] == symbol) ||

        (board[0][0] == symbol) && (board[1][0] == symbol) && (board[2][0] == symbol) ||
        (board[0][1] == symbol) && (board[1][1] == symbol) && (board[2][1] == symbol) ||
        (board[0][2] == symbol) && (board[1][2] == symbol) && (board[2][2] == symbol) ||

        (board[0][0] == symbol) && (board[1][1] == symbol) && (board[2][2] == symbol) ||
        (board[0][2] == symbol) && (board[1][1] == symbol) && (board[2][0] == symbol)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
        };
        Scanner scanner = new Scanner(System.in);
        while (true) {
            playerMove(board, scanner);
            if(isGameOver(board)){break;};
            printBoard(board);
            computerMove(board);
            if(isGameOver(board)){break;};
            printBoard(board);
        }
        scanner.close();
    }
}