package mycodingprac;
import java.util.*;
public class addnumberusingfunction {
	
	public static int sum(int num1, int num2) {
	int ans = num1 + num2;
	return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int n1 = sc.nextInt();
		System.out.println("enter the second number");
		int n2 = sc.nextInt();
		int sum = sum(n1,n2);
		System.out.println("the sum of "+n1+"and " +n2+"is :"+sum);

	}

}
