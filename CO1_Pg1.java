import java.util.*;

public class product
{
	int pcode;
	String pname;
	int price;	
	
	void getData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the product code:");
		pcode = input.nextInt();
		input.nextLine();
		System.out.print("Enter the product name:");
		pname = input.nextLine();
		System.out.print("Enter the price:");
		price = input.nextInt();
	}
	
	void outData()
	{
		System.out.println("Product code:"+pcode);
		System.out.println("Product name:"+pname);
		System.out.println("Price:"+price);
	}
	
	public static void main(String[] args)
	{
		product obj1 = new product();
		obj1.getData();
		obj1.outData();
		product obj2 = new product();
		obj2.getData();
		obj2.outData();
		product obj3 = new product();
		obj3.getData();
		obj3.outData();
		
		System.out.println();
		
		if((obj1.price<obj2.price)&&(obj1.price<obj3.price))
		{
            		System.out.println(obj1.pname+" has the lowest price :"+obj1.price);
        	}
        	else if((obj2.price<obj1.price)&&(obj2.price<obj3.price))
		{
            		System.out.println(obj2.pname+" has the lowest price :"+obj2.price);
        	}
        	else
		{
            		System.out.println(obj3.pname+" has the lowest price :"+obj3.price);
        	}
	}

}
