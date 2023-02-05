package Java;

//One interface can extend another.
interface An {
void meth1();
void meth2();
}
//B now includes meth1() and meth2() -- it adds meth3().
interface Bm extends An {
void meth3();
}
//This class must implement all of A and B
class MyClass implements Bm {
public void meth1() {
	
	int[] b = new int[3];
	b[2]=6;
	System.out.println("b= "+b);
}

public void meth2() {
	System.out.println("meth2");
	
}

public void meth3() {
	// TODO Auto-generated method stub
	
}


}
class IFExtend {
public static void main(String arg[]) {
MyClass ob = new MyClass();
try
{
ob.meth1();
}
catch(Exception e)
{
System.out.println("Exception occured catched");
}
finally
{
System.out.println("gbnhvfhj");
}

ob.meth2();
ob.meth3();
System.out.println("before");
int a =5/0;
System.out.println(a);
System.out.println("End program");


}
}
