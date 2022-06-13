import java.util.*;

public class sortstr
{
	public static void main(String[] args)
	{
		String s,str;
		String a[]=new String[30];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		s = input.nextLine();
		a = s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					str = a[i];
					a[i] = a[j];
					a[j] = str;
				}
			}
		}
		System.out.println("Sorted Order: ");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		input.close();
	}
}
