import java.util.Scanner;
public class IntegerConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter the Integer: ");
		
		int theInt = myInput.nextInt();
		String intStr = Integer.toString(theInt, 2);
		System.out.println(intStr);

	}

}
