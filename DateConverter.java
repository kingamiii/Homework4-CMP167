package hw4;
/*amirah igbara
 *CMP167
 *Prof. Kelly
 *Oct 21 2023*/

import java.util.Scanner;
public class DateConverter {

	public static void main(String[] args) {
		// Entering Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaring variables
		int dayNum, monNum, date, year;
		String day =  "";
		String month = "";
		boolean leapYear;
		
		// Getting input
		System.out.println("Enter 4 integers representing dayNumber monthNumber date year:");
		dayNum = sc.nextInt();
		monNum = sc.nextInt();
		date = sc.nextInt();
		year = sc.nextInt();		
		sc.close();
		
		// leapYear
		if ((year %400 == 0) || ((year %4 == 0) && (year %100 != 0))) {
			leapYear = true;
		} else {
			leapYear = false;
		}
		
		// Switches
		switch (dayNum) {
		  case 1: day = "Sunday"; break;
		  case 2: day = "Monday"; break;   
	     case 3: day = "Tuesday"; break;   
	     case 4: day = "Wednesday"; break;
	     case 5: day = "Thursday"; break;
	     case 6: day = "Friday"; break;
	     case 7: day = "Saturday"; break;
	    
		}
		
		switch (monNum) {
		case 1: month = "January"; break;   
	     case 2: month = "February"; break;   
	     case 3: month = "March"; break;
	     case 4: month = "April"; break;
	     case 5: month = "May"; break;
	     case 6: month = "June"; break;
	     case 7: month = "July"; break;
	     case 8: month = "August"; break;
	     case 9: month = "September"; break;
	     case 10: month = "October"; break;
	     case 11: month = "November"; break;
	     case 12: month = "December"; break;
		}
		
		// error checks & output
		if ((dayNum < 1) || (dayNum >7)) {
			System.out.println("Invalid day number: " + dayNum + ", please enter a number from 1..7.");
		}else if ((monNum <1) || (monNum > 12)) {
			System.out.println("Invalid month number: " + monNum + ", please enter a number from 1..12.");
		}else if ((date < 1) || (date >31)) {
			System.out.println("Invalid date number: " + date + ", please enter a number from 1..31.");
		}else if ((monNum == 4) && (date > 30)) {
			System.out.println("Invalid date: " + month +", does not have "+ date + " days, please enter a valid date.");
		}else if ((monNum == 6) && (date >30)) {
			System.out.println("Invalid date: " + month +", does not have "+ date + " days, please enter a valid date.");
		}else if ((monNum == 9 ) && (date > 30)) {
			System.out.println("Invalid date: " + month +", does not have "+ date + " days, please enter a valid date.");
		}else if ((monNum == 11 ) && (date > 30)){
		   System.out.println("Invalid date: " + month +", does not have "+ date + " days, please enter a valid date.");
		}else if((monNum == 2 ) && (date > 29)) {
			System.out.println("Invalid date: " + month +", does not have "+ date + " days, please enter a valid date.");
		}else if ((!leapYear) && (monNum ==2) && (date == 29)) {
			System.out.println("Invalid date: " + year + " is not a leap year, February does not have " + date + " days, please enter a valid date.");
		}else {
			System.out.println(dayNum + " " + monNum + " " + date + " " + year + " is " + day + " " + month + " " + date + ", " + year);
		}
		
		
	}
}
		
