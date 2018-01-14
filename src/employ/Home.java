package employ;

import java.util.Scanner;

public class Home {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter EmployId");
		Scanner s=new Scanner(System.in);
		
		EmployDetails employDetails=Utils.getDetails(s.nextInt());
		try {
			System.out.println(employDetails.details());
		} catch (Exception e) {
			System.out.println("Employ Id Not Found! ");
		}
	}
}
