package Java2;
import java.util.*;
public class pyramidnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i, j;
        for (i = 1; i <= N; i++){
            for (j = 1; j <= i; j++){
                System.out.print (j + " ");
            }
        System.out.println ();
        }
; 
	}

}
