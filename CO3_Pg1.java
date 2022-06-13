import java.util.*;
class  shape
{
	void area(int w)
	{
		System.out.println("The area of the square: " +Math.pow(w, 2));
	}
	void area(int x, int y)
	{
		System.out.println("The area of the rectangle: " +(x*y));
	}
	void area(double z)
	{
		double a = 3.14*(z*z);
		System.out.println("The area of circle: " +a);
	}
}
public class area
{
	public static void main(String[] args)
	{
		shape obj = new shape();
		obj.area(4);
		obj.area(4,2);
		obj.area(5.0);
	}
}
