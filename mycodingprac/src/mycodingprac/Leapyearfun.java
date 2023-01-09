package mycodingprac;
import java.util.*;
public class Leapyearfun {
	
	public static void leap (int yr) {
		
		if(yr % 400 == 0) {
			System.out.println("leap year");
		}
		else if( yr % 100 == 0) {
			System.out.println("not a leap yr");
		}
		else if (yr % 4 == 0) {
			System.out.println("leap year");
		}
		else
		{
			System.out.println("leap yr");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year: ");
		int yr = sc.nextInt(); 
		Leapyearfun.leap(yr);
		

	}

}
