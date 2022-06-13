import java.util.*;

class Person
{
	String name,gender,address;
	int age;
	Person(String name,String gender,String address,int age)
	{
			this.name=name;
			this.gender=gender;
			this.address=address;
			this.age=age;
	}
}

class Employee extends Person
{
	int empid,salary;
	String company_name,qualification;
	Employee(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary)
	{
		super(name,gender,address,age);
		this.empid=empid;
		this.company_name=company_name;
		this.qualification=qualification;
		this.salary=salary;
	}
}

class Teacher extends Employee
{
	String subject,department;
	int teacherid;
	Teacher(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary,
			String subject,String department,int teacherid)
	{
		super(name,gender,address,age,empid,company_name,qualification,salary);
		this.subject=subject;
		this.department=department;
		this.teacherid=teacherid;
	}
	
	void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Gender: "+this.gender);
		System.out.println("Address: "+this.address);
		System.out.println("Age: "+this.age);
		System.out.println("Employee ID: "+this.empid);
		System.out.println("Company Name: "+this.company_name);
		System.out.println("Qualification: "+this.qualification);
		System.out.println("Salary: "+this.salary);
		System.out.println("Subject: "+this.subject);
		System.out.println("Department: "+this.department);
		System.out.println("Teacher ID: "+this.teacherid);
		System.out.println();
	}
}
public class pg3
{

	public static void main(String[] args)
	{
		System.out.print("Enter No. of Teachers: ");
		 Scanner input= new Scanner(System.in);
		 int t=input.nextInt();
		 Teacher[] a=new Teacher[t];
		 input.nextLine();
		 for(int i=0;i<t;i++)
		 {
			 System.out.print("Enter the name: ");
			 String name=input.nextLine();
			 System.out.print("Enter the gender: ");
			 String gender=input.nextLine();
			 System.out.print("Enter the address: ");
			 String addr=input.nextLine();
			 System.out.print("Enter the age: ");
			 int age=input.nextInt();
			 input.nextLine();
			 System.out.print("Enter the empid: ");
			 int id=input.nextInt();
			 input.nextLine();
			 System.out.print("Enter the company_name: ");
			 String company_name=input.nextLine();
			 System.out.print("Enter the qualification: ");
			 String qualification=input.nextLine();
			 System.out.print("Enter the salary: ");
			 int salary=input.nextInt();
			 input.nextLine();
			 System.out.print("Enter the subject: ");
			 String subject=input.nextLine();
			 System.out.print("Enter the department: ");
			 String dept=input.nextLine();
			 System.out.print("Enter the teacherid: ");
			 int teacherid=input.nextInt();
			 input.nextLine();
			 Teacher x=new Teacher(name,gender,addr,age,id,company_name,qualification,salary,subject,dept,teacherid);
			 a[i]=x;
			 System.out.println();
		 }
		 for(int i=0;i<t;i++)
		 {
				a[i].display();
		 }

	}

}
