import java.util.Scanner;

public class Eggs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter the nubmer of eggs: ");
		int numberOfEggs = myInput.nextInt();
		int numberOfdozen = numberOfEggs / 12;
		int remainingEggs = numberOfEggs  % 12;
		double costOfDozen = 3.25;
		double costOfOneEgg = 45;
		double total = ((3.25 * numberOfdozen) + (remainingEggs * costOfOneEgg)/100);
		
		System.out.printf("You ordered %d eggs. Thats %d "
				+ "dozen at $3.25 per dozen and %d loose eggs"
				+ " at 45 cents each for a total of $%.2f",
				numberOfEggs, numberOfdozen, remainingEggs, total);
	
	}

}
