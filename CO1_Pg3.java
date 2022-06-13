import java.util.*;

public class complexno
{
	int real,img;
	Scanner input = new Scanner(System.in);
	
	void getData()
	{
		System.out.println("Enter the real part of the complex no:");
		real = input.nextInt();
		System.out.println("Enter the imaginary part of the complex no:");
		img = input.nextInt();
	}
	
	void putData()
	{
		System.out.println("Complex number : "+real+"+"+img+"i");
	}

	public static void main(String[] args)
	{
		complexno obj1 = new complexno();
		obj1.getData();
		obj1.putData();
		complexno obj2 = new complexno();
		obj2.getData();
		obj2.putData();
		int nr, ni;
		nr = obj1.real+obj2.real;
		ni = obj1.img+obj2.img;
		System.out.println("Complex number : "+nr+"+"+ni+"i");

	}

}
