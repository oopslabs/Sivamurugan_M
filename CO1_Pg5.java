import java.util.Scanner;

class cpu
{
	int price;
	class processor
	{
		int core;
		String manufacturer;
		processor(int x,String s)
		{
			core=x;
			manufacturer=s;
		}
		void display()
		{
			System.out.println("Core- "+core+"\n"+"Manufacturer- "+manufacturer);
		}
	}
	static class ram
	{
		int memory;
		String manufacturer;
		ram(int x,String s)
		{
			memory=x;
			manufacturer=s;
		}
		void display()
		{
			System.out.println("Memory- "+memory+"\n"+"Manufacturer- "+manufacturer);
		}
	}
}
public class computer
{
	public static void main(String[] args)
	{
		int i;
		String j;
		cpu c=new cpu();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the core:");
		i = input.nextInt();
		System.out.print("Enter the manufacturer:");
		input.nextLine();
		j = input.nextLine();
		cpu.processor p= c.new processor(i,j);
		cpu.ram r=new cpu.ram(4, "Crucial");
		p.display();
		r.display();
		System.out.println();
	}
}
