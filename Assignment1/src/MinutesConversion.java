import java.util.Scanner;

public class MinutesConversion {
	public static void main(String [] arg) {
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		double minutes = myInput.nextInt();
		
		double hours = minutes / 60;
		double days = minutes / (double)(60 * 24);
		System.out.printf("%.0f minutes equals %.0f hours  and equals %.3f days ", minutes,  hours , days);
		
	}

}
