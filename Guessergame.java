import java.util.Scanner;

class Guesser {
    int gessernum;

    public int GuessNum() {
        Scanner s = new Scanner(System.in);
        System.out.println("guesser  guess your number");
        gessernum = s.nextInt();
        return gessernum;
    }
}

class Player {
    int Playernum;

    public int GuessNum() {
        Scanner s = new Scanner(System.in);
        System.out.println("Player   guess your number");
        Playernum = s.nextInt();
        return Playernum;
    }
}

class Umpire {
    int GuesserNum1;
    int PlayerNum1;
    int PlayerNum2;
    int PlayerNum3;

    public void collectNumFromGuesser() {
        Guesser G = new Guesser();
        GuesserNum1 = G.GuessNum();
    }

    public void collectNumFromPlayers() {
        Player P1 = new Player();
        PlayerNum1 = P1.GuessNum();

        Player P2 = new Player();
        PlayerNum2 = P2.GuessNum();
         Player P3=new Player();
        PlayerNum3 = P3.GuessNum();
    }

    void compare() {
        if (GuesserNum1 == PlayerNum1) {
            if (GuesserNum1 == PlayerNum2 && GuesserNum1 == PlayerNum3) {
                System.out.println("All Player won the game");
            } else if (GuesserNum1 == PlayerNum2) {
                System.err.println("Player 1 and 2 won the game ");
            } else if (GuesserNum1 == PlayerNum3) {
                System.err.println("Player 1 and 3 won the game ");
            } else {
                System.out.println("Only player 1 won the game");
            }
        } else if (GuesserNum1 == PlayerNum2) {
            if (GuesserNum1 == PlayerNum3) {
                System.out.println("Player 2 and 3 won the game ");
            } else {
                System.out.println("Only player 2 won the game");
            }
        } else if (GuesserNum1 == PlayerNum3) {
            System.out.println("Only Player  3 won the game ");
        } else {
            System.out.println("All player lost the game");
        }

    }
}

public class Guessergame {
    public static void main(String[] args) {

        System.out.println("-----Start the Game ------");

     Umpire U=new Umpire();
     U.collectNumFromGuesser();
     U.collectNumFromPlayers();
     U.compare();

     System.out.println("-----Game Over------");
    }
}
