import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    private String name;
    
    public DiceGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("who is your name? > \n");
        name = sc.nextLine();
        greet();
    }
    
    public void greet() {
        System.out.println("Hollo, " + name + "!");
    }
    
    public void playDiceGame() {
        System.out.println("Rolling dice...");
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1; 
        int die2 = rand.nextInt(6) + 1;
        int total = die1 + die2;
	System.out.printf("Die 1: %d\n", die1);
	System.out.printf("Die 2: %d\n",die2);
	System.out.printf("Total value: %d\n",total);
    }

    public static void main(String args[]) {
        DiceGame game = new DiceGame();
        game.playDiceGame();
    }
}
