package Apnacollege;
import java.util.*;

public class LinearSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numb[] = new int[size];
		for (int i = 0; i < size; i++) {
			numb[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		for (int i = 0; i < numb.length; i++) {
			if (numb[i] == x);
			{
				System.out.println("x found at index" + i);
			}

		} 
	}
}
