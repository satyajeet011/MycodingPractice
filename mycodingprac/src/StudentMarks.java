package Java;

import java.util.*;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		
		Integer[] total = new Integer[5];

		int marks1;
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter Name of student ");
			name[i] = sc.next();
			int totalMarks=0;
			for (int j = 0; j < 2; j++) {

				System.out.println("Enter the marks of " + (j + 1) + " subject");
				marks1 = sc.nextInt();
				totalMarks += marks1;
			}
			total[i] = totalMarks;
		}
		for(int i=0;i<5;i++)
		{
		System.out.println("Total Marks of "+name[i]+" = "+total[i]);
		}
	}

}
