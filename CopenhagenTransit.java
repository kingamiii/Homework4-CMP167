package hw4;


/*amirah igbara
 * CMP 167
 * Prof. Kelly
 * oct 16, 23*/
import java.util.Scanner;

public class CopenhagenTransit {

	public static void main(String[] args) {
		// entering scanner
		Scanner sc = new Scanner(System.in);

		// declaring variables
		int zoneNumber;
		String adultOrChild;
		double fare;

		// gathering info
		System.out.println("Enter zone number :");
		zoneNumber = sc.nextInt();
		System.out.println("Enter adult or child :");
		adultOrChild = sc.next();
		sc.close();
		// if - else if - else

		if (zoneNumber <= 2 && adultOrChild.equalsIgnoreCase("adult")) {
			fare = 23.0;
		} else if (zoneNumber <= 2 && adultOrChild.equalsIgnoreCase("child")) {
			fare = 11.5;
		} else if (zoneNumber == 3 && adultOrChild.equalsIgnoreCase("adult")) {
			fare = 34.5;
		} else if (zoneNumber == 3 || zoneNumber == 4 && adultOrChild.equalsIgnoreCase("child")) {
			fare = 23.0;
		} else if (zoneNumber == 4 && adultOrChild.equalsIgnoreCase("adult")) {
			fare = 46.0;
		} else {
			fare = -1.00;
		}

		// outputting fares per input
		System.out.println("The fare for " + adultOrChild + " to zone number " + zoneNumber + " is " + fare + ".");
	}
}
