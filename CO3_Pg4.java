import java.util.Scanner;

class publisher{
	String pname;
	publisher(String pname){
		this.pname=pname;
	}
}
class book extends publisher{
	String bname,author;
	book(String pname,String bname,String author) {
		super(pname);
		this.bname=bname;
		this.author=author;
	}
}
class Literature extends book{
	Literature(String pname,String bname,String author) {
		super(pname,bname,author);
	}
	void disp(){
		System.out.println("Genere - Literature\nBook Name - "+bname);
		System.out.println("Publisher Name : "+pname+"\nAuthor : "+author+"");
	}
}
class Fiction extends book{
	Fiction(String pname,String bname,String author) {
		super(pname,bname,author);
	}
	void disp(){
		System.out.println("Genere - Fiction\nBook Name - "+bname);
		System.out.println("Publisher Name : "+pname+"\nAuthor : "+author+"");
	}
}
public class CO3_Pg4 {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the publisher");
		String pname=s.nextLine();
		System.out.println("Enter the Author");
		String author=s.nextLine();
		System.out.println("Enter the Book");
		String bname=s.nextLine();
		System.out.println("Enter the Genere");
		String gen=s.nextLine();
		if(gen.equals("Fiction")){
			Fiction f=new Fiction(pname,bname,author);
			f.disp();
		}
		else if(gen.equals("Literature")){
			Literature l =new Literature(pname,bname,author);
			l.disp();
		}
	}
}
