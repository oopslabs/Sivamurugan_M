
import java.util.*;

class box{
	int length,breadth;

	}

class box3d extends box{
	int height;
	box3d(int len,int bth,int hth){
		length=len;
		breadth=bth;
		height=hth;
	}
	void display()
	{
		System.out.println("area="+(length*breadth));
		System.out.println("volume="+(length*breadth*height));
	}
}
public class Q1{
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length: ");
		int l=input.nextInt();
		System.out.println("Enter the breadth: ");
		int b=input.nextInt();
		System.out.println("Enter the height: ");
		int h=input.nextInt();
		box3d obj=new box3d(l,b,h);
		obj.display();
	}
}
