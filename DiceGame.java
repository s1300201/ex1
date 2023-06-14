import java.util.Random;


public class DiceGame {
    public static void main(String args[]){
    
   
	System.out.println("Rolling dice...");
	Random rand = new Random();
	int die1 = rand.nextInt(6) + 1;
	int die2 = rand.nextInt(6) + 1;
	int total = die1 + die2;
    
	System.out.printf("Die 1: %d\n", die1);
	System.out.printf("Die 2: %d\n",die2);
	System.out.printf("Total value: %d\n",total);
    
    }
}

    

   
