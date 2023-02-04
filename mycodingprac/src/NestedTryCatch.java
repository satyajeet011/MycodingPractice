package Java;

public class NestedTryCatch {
	{

	public static void main(String[] args)
{
	int n =4;
	int[] arr = {4,8,16,32,64};
	for(int i=0; i<=10; i++)
	{
		try
		{
			int result = arr[i]/n;
			System.out.println(arr[i]+ "/"+n+"="+result);
			n--;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds");
		}	
	}
	catch(ArithmeticException e)
	{
		System.out.println("Can't Divide by zero...");
	}
  }
	System.out.println("Statement after try-catch block");
}
}
