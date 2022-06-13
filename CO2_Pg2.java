import java.util.*;

public class searcharray
{

	public static void main(String[] args)
	{
		int a[]=new int[10];
		int b=0,k,i,x;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		k=input.nextInt();
		System.out.print("Enter the element: ");
		for(i=0;i<k;i++)
		{
			a[i] = input.nextInt();
		}
		System.out.print("Enter the element to be searched: ");
		x = input.nextInt();
		for(i=0;i<k;i++)
		{
			if(a[i]==x)
			{
				System.out.println("Number found");
				b=1;
				break;
			}
		}
		 if(b==0)
		 {
			 System.out.println("Number not found");
		 }
			 
	}

}
