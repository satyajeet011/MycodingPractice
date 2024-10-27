/* A person purchases 3 apple which is around 845gm, where the apple price is 325/- kg.calculate the total price for 3 apple and 12% GST extra.*/
public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int price  = 325;
float price1 = 325.0f/1000;
System.out.println("the price of each apple is :"+price1);
System.out.println("now we calculate the total price if 3 apple:------------");
float t1 = price1*845;
System.out.println("the price of 3 apple is: "+t1);
float gst = t1*12.0f/100;
System.out.println("GST on 3 apple is:"+gst);
float total = t1+gst;
System.out.println("after adding the gst, the price of 3 apple is:"+total);

	}

}
