import java.util.Scanner;

class account extends Exception{
	account(String msg){
		super(msg);
	}
}
public class Q2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int bal=10000;
		int wdr,dep;
		int ch=1;
		do {
	
			switch(ch)
			{
			case 1:System.out.println("Enter amount to withdraw: ");
			wdr=s.nextInt();
			bal=bal-wdr;
			try{	
				if(bal<0){
						throw new account("Insufficient balance.");
				}
				else{
					System.out.println("Withdrawal successfully:\nBlanace: "+bal);
				}
					
				}
			catch(account e){
				System.out.println(e.getMessage());
		}
			break;
			case 2:System.out.println("Enter amount to deposit: ");
			dep=s.nextInt();
			bal=bal+dep;
			System.out.println("Balance: "+bal);
			}
			
		}while(ch!=1);
	}
}