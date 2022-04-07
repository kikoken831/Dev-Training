import java.util.*;

class Guesser {
    int g;

    Guesser() {
        storeGuess();
    }

    void storeGuess() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Guesser's Guess: ");
        g = input.nextInt();

    }

    int getNum() {
        return g;
    }
}

class Player {
    int p;

    Player() {
        storeGuess();
    }

    void storeGuess() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Players's Guess: ");
        p = input.nextInt();

    }

    int getNum() {
        return p;
    }
}

class Umpire {
    int g;
    int p1;
    int p2;
    int p3;

    Umpire() {
        Guesser g1 = new Guesser();
        Player pl1 = new Player();
        Player pl2 = new Player();
        Player pl3 = new Player();

        p1 = pl1.getNum();
        p2 = pl2.getNum();
        p3 = pl3.getNum();

        g = g1.getNum();

    }

    void compare() {
        if(p1 == g){
            System.out.println("Player 1 Won");
            
        }
        else if(p2 == g){
            System.out.println("Player 2 Won");

        }
        else if(p3 == g){
            System.out.println("Player 3 Won");

        }
        else{
            System.out.println("No one won");
        }
    }
}

public class GGDriver {
    public static void main(String[] args) {
        Umpire ump = new Umpire();
        ump.compare();
    }
}
