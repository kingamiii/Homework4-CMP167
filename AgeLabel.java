package hw4;
/*amirah igbara
 * CMP 167
 * Prof. Kelly
 * 10/17/23*/
import java.util.Scanner;
public class AgeLabel {

	public static void main(String[] args) {
		// Entering the Scanner
		Scanner sc = new Scanner(System.in);
		 
		// Declaring the variables
		int days, years;
		
		// Getting age in years
		System.out.println("Enter an age in number of days :");
		days = sc.nextInt();
		sc.close();
		
		// Converting days to years
		years = days / 365;
		
		// What are you?
		
		if (years <= 1) {
			System.out.println("You are an infant");
			}
		else if ((years > 1) && (years <= 3)) {
			System.out.println("You are a toddler");
			}
		else if ((years > 3) && (years <= 12)) {
			System.out.println("You are a child");
		}
		else if ((years > 12) && (years <= 19)) {
			System.out.println("You are a teenager");
		}
		else if ((years > 19)&&(years <= 21)) {
			System.out.println("You are a young adult");
		}
		else if ((years > 21)&&(years <= 50)) {
			System.out.println("You are an adult");
		}
		else if ((years > 50)&&(years <= 65)) {
			System.out.println("You are middle aged");
		}
		else {
			System.out.println("You are a senior citizen");
		}
	}

}
