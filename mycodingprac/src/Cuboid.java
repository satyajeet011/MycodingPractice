package abdulbari;


public class Cuboid {
	public static void main(String[] args) 
    {
		int p =2;
		char q = '2';
		String r = "2";
		System.out.println("p = "+p+" q= "+q+" r = "+r);
		String values[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
		
       int a = 78265;
       String b= Integer.toString(a);
       
       char[] ar = new char[b.length()];
       ar=b.toCharArray();
       System.out.println("b = "+b);
       
       System.out.println("ar[] = "+ar[0]);
       System.out.println("ar[] = "+Character.getNumericValue(ar[0]));
       
       String result="";
       
       for(int i=0;i<ar.length;i++)
       {
    	 //  System.out.println("ar[] = "+ar[i]);
    	 result = result + values[Character.getNumericValue(ar[i])]+"";
       //System.out.println(" "+values[Character.getNumericValue(ar[i])]);
       }
       System.out.println(result);
    }
}
