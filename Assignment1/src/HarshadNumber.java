import java.util.Scanner;
public class HarshadNumber {
	public static boolean DetermineHarshadNumber(int num) {
		int res = 0;
		int n = num;
		while (n > 0) {
			res += n % 10;
			n = n / 10;
		}
		return num % res == 0;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter the Integer: ");
		int intNum = myInput.nextInt();
		if(DetermineHarshadNumber(intNum))
			System.out.println(intNum + " is a Harshad Number");
		else
			System.out.println(intNum + " is not a Harshad Number");
		
		

	}

}
