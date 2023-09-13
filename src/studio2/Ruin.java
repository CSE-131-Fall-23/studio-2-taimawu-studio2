package studio2;
import java.util.Scanner;


public class Ruin { 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Starting Amount ");
		double startingAmount = in.nextDouble();
		double copy = startingAmount;
		//System.out.println(startingAmount);
		System.out.println("Win Chance");
		double winChance = in.nextDouble();
		// System.out.println(winChance);
		System.out.println("Win Limit");
		double winLimit = in.nextDouble();
		// System.out.println (winLimit); 
		System.out.println("How many days are you playing");
		int daysPlayed = in.nextInt();
		double totalMoney = 0;
		double winRate = 0;
		
		for(int i=0; i<daysPlayed; i++) {
			
		
		
			while(startingAmount<winLimit && startingAmount>0) {
				double randomNumber = Math.random();
				if (randomNumber<winChance) { 
					startingAmount += 10000;
					System.out.println("You won " + startingAmount);
					
				}
				else {
					startingAmount -= 10000;
					System.out.println("Stop wasting rent money " + startingAmount);
				}
			}
			if (startingAmount == winLimit) {
				winRate ++;
				System.out.println("Stop gambling please, you won " + startingAmount);
				System.out.println();
				
			}
			else {
				System.out.println("You lost your life savings " + startingAmount);
				System.out.println();
				
						}
			totalMoney += startingAmount;
			startingAmount = copy;
			
			
}
		System.out.println("Total Money " + totalMoney);
		System.out.println("Win rate " + winRate/daysPlayed);
		System.out.println("Ruin rate " + (daysPlayed - winRate)/daysPlayed);
		

	}

}

