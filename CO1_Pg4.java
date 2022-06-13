import java.util.*;

public class symmetric
{
	private static Scanner read;
	
	public static void main(String[] args)
	{
		int[][] a=new int[10][10];
		int i,j;
		read = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int r = read.nextInt();
		System.out.print("Enter the number of columns:");
		int c = read.nextInt();
		System.out.println("Enter the elements of the matrix");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=read.nextInt();
			}
		}
		System.out.println("\n-----Matrix-----\n");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("\n-----Traversed matrix-----\n");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[j][i]+"\t");
			}
			System.out.print("\n");
		}
		
	}

}
