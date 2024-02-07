import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        printBoard(board);
        boolean gameEnded = false;

        while (!gameEnded) {
            System.out.print("Player 1 enter row number:");
            int row = reader.nextInt();
            System.out.print("Player 1 enter column number:");
            int col = reader.nextInt();
            board[row - 1][col - 1] = 'X';
            printBoard(board);

            if (checkWin(board, 'X')) {
                System.out.println("Player 1 wins!");
                gameEnded = true;
                break;
            }

            System.out.print("Player 2 enter row number:");
            row = reader.nextInt();
            System.out.print("Player 2 enter column number:");
            col = reader.nextInt();
            board[row - 1][col - 1] = 'O';
            printBoard(board);

            if (checkWin(board, 'O')) {
                System.out.println("Player 2 wins!");
                gameEnded = true;
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("    1   2   3");
        System.out.println("   -----------");
        for (int row = 0; row < 3; ++row) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < 3; ++col) {
                System.out.print("|");
                System.out.print(" " + board[row][col] + " ");
                if (col == 2)
                    System.out.print("|");

            }
            System.out.println();
            System.out.println("   -----------");
        }
    }

    public static boolean checkWin(char[][] board, char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }
}
