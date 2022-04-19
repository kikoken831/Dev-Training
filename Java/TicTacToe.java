import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        gameState board = new gameState();
        board.display();
        gamePlayer p1 = new gamePlayer("Player 1");
        for (int i = 0; i < 9; i++) {
            p1.getInput();
            System.out.println();
            board.display();
        }

    }
}

class gameState {
    static char grid[][] = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
            { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };
    static boolean playerTurn = true;

    void display() {
        for (char c[] : grid) {
            System.out.println(c);
        }
    }

    static void writeState(int pos) {
        char c;
        boolean state = true;
        if (playerTurn == true) {
            c = 'X';
            playerTurn = false;
        } else {
            c = 'O';
            playerTurn = true;
        }

        switch (pos) {
            case 1:
                grid[0][0] = c;
                break;
            case 2:
                grid[0][2] = c;
                break;
            case 3:
                grid[0][4] = c;
                break;
            case 4:
                grid[2][0] = c;
                break;
            case 5:
                grid[2][2] = c;
                break;
            case 6:
                grid[2][4] = c;
                break;
            case 7:
                grid[4][0] = c;
                break;
            case 8:
                grid[4][2] = c;
                break;
            case 9:
                grid[4][4] = c;
                break;
            default:
                System.out.println("Wrong input");
                break;
        }

    }
}

class gamePlayer {
    String playerName;

    gamePlayer(String name) {
        playerName = name;
    }

    void getInput() {
        System.out.println(playerName + ": please input your position");
        Scanner s = new Scanner(System.in);
        int game_pos = s.nextInt();
        gameState.writeState(game_pos);

    }
}