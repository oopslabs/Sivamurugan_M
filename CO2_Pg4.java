import java.util.Scanner;

class employee
{
	int eNo;
	String eName;
	int eSalary;
	employee(int a,String b,int c)
	{
		eNo=a;
		eName=b;
		eSalary=c;
	}
}
public class emp
{

	public static void main(String[] args)
	{
		int i=0,f=0;
		employee o[]=new employee[10];
		System .out.println("Enter the number of employees");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		while(i<n)
		{
			System .out.println("Enter employee id");
			int a=input.nextInt();
			System .out.println("Enter employee name");
			input.nextLine();
			String b=input.nextLine();
			System .out.println("Enter employee salary");
			int c=input.nextInt();
			o[i]=new employee(a,b,c);
			i++;
		}
		System .out.println("Enter employee id to search details");
		int a=input.nextInt();
		i=0;
		while(i<n)
		{
			if(o[i].eNo==a)
			{
				System .out.println("Employee Found ");
				System .out.println("eNo : "+o[i].eNo+"\neName : "+o[i].eName+"\neSalary : "+o[i].eSalary);
				f=1;
			}
			i++;
		}
		if(f==0)
		{
			System .out.println("Employee Not Found");
		}

	}

}
