package Java2;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		if ( n % 4 == 0)
			System.out.println("yes");
		else if(n % 400 == 0)
		System.out.println("no");	
		else if(n % 100 == 0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}

}
