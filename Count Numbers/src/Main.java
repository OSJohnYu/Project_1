import java.util.Scanner;

public class Main {

	/**
	 * @author jyu_6
	 * @title Pie
	 * @param args
	 */
	
	public static int count(int b){
		String text = Double.toString(Math.abs(b));
	    int integerPlaces = text.indexOf('.');
	    int decimalPlaces = text.length() - integerPlaces - 1;
	    int totalPlaces = integerPlaces + decimalPlaces;
	    
	    return integerPlaces;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scan.nextInt();
		boolean fact = true;
		while (fact) {
			System.out.println("Is " + input + " the number you wanted? Yes or No ?");
			String input2 = scan2.nextLine();
			if (input2.equals("No")) {
				System.out.print("Please Enter another number: ");
				input = scan.nextInt();
				fact = true;
			} else {
				fact = false;
			}
		}
		System.out.println("Your number is " + count(input) + " places long. ");

		scan.close();
		scan2.close();
	}

}
