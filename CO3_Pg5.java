import java.util.*;

public class pg5
{
	public static void main(String[] args)
	{
		Result out=new Result();
		out.display();
		
	}
}

interface Student
{
	String name="Ajil";
	int Aos=27, Ai=41,Adbms=41;
	
}

interface Sports
{
	int Credit=45;
	
}

class Result implements Student, Sports
{
	void display()
	{
		System.out.println("Name: "+name+"\nMarks for AOS: "+Aos+"\nMarks for AI: "+Ai+"\nMarks for ADBMS: "+Adbms+"\nSports credit score: "+Credit);

}
}
