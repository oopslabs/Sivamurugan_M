import java.util.*;

class AuthenticateException extends Exception
{
	public AuthenticateException(String msg)
	{
		System.out.println(msg);
		
	}
}

public class pg3
{

	public static void main(String[] args)
	{
		try
		{
			String User= "AjilK",Pass= "Ajil123";
			String Username,Password;
			Scanner input= new Scanner(System.in);
			System.out.print("Enter the Username: ");
			Username= input.nextLine();
			System.out.print("Enter the Password: ");
			Password= input.nextLine();
			if(Username.equals(User)&& Password.equals(Pass))
			{
				System.out.println("Authentication successful");
				
			}
			else
			{
				throw new AuthenticateException("Authentication failed");
				
			}
		}
			catch(AuthenticateException alert)
			{
				System.out.println(alert);
			}
		
	}
}
