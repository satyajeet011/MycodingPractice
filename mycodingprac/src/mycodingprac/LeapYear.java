package mycodingprac;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the year: ");
		Scanner sc = new Scanner(System.in);
		int year  = sc.nextInt();
		if (year % 400 == 0) {
		      System.out.println(year + " is a leap year.");
		    } 
		    else if (year % 100 == 0) {
		      System.out.println(year + " is not a leap year.");
		    } 
		    else if (year % 4 == 0) {
		      System.out.println(year + " is a leap year.");
		    } 
		    else {
		      System.out.println(year + " is not a leap year.");
		    }
		

	}

}
