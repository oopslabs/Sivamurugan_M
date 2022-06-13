import java.util.*;

class employee
{
	int empid,salary;
	String name,address;
	employee(int empid,String name,String address,int salary)
	{
		this.empid=empid;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
}

class teacher extends employee
{
	String dept,subject;
	teacher(int empid,String name,String address,int salary,String dept,String subject)
	{
		super(empid,name,address,salary);
		this.dept=dept;
		this.subject=subject;
	}

	void display()
	{
		System.out.println("Employee ID: "+this.empid);
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee Address: "+this.address);
		System.out.println("Employee Salary: "+this.salary);
		System.out.println("Employee Department: "+this.dept);
		System.out.println("Employee Subjects: "+this.subject);
		System.out.println();
	}
}
public class pg2
{
	
	public static void main(String[] args)
	{
		 System.out.print("Enter No. of Teachers: ");
		 Scanner input= new Scanner(System.in);
		 int t=input.nextInt();
		 teacher[] a=new teacher[t];
		 for(int i=0;i<t;i++)
		 {
			 System.out.print("Enter the empid: ");
			 int id=input.nextInt();
			 input.nextLine();
			 System.out.print("Enter the empname: ");
			 String name=input.nextLine();
			 System.out.print("Enter the address: ");
			 String addr=input.nextLine();
			 System.out.print("Enter the salary: ");
			 int sal=input.nextInt();
			 input.nextLine();
			 System.out.print("Enter the department: ");
			 String dept=input.nextLine();
			 System.out.print("Enter the subject: ");
			 String sub=input.nextLine();
			 teacher x=new teacher(id,name,addr,sal,dept,sub);
			 a[i]=x;
			 System.out.println();
		 }
		 for(int i=0;i<t;i++)
		 {
				a[i].display();
		 }
	}

}
