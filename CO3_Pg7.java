interface calc1{
	int orderno=12;
	String date="12/12/2121";
	int calculate(int t1,int t2);
}
class bill implements calc1{
	int pid,qnty,uprice,total;
	String name;
	bill(int pid,String name,int qnty,int uprice,int total){
		this.name=name;
		this.pid=pid;
		this.qnty=qnty;
		this.uprice=uprice;
		this.total=total;
	}
	public int calculate(int t1,int t2) {
		return(t1+t2);
	}
}
public class CO3_Pg7 {
	public static void main(String [] args) {
		bill b1=new bill(101,"A",2,25,50);
		bill b2=new bill(102,"B",1,100,100);
		System.out.println("Order No : "+b1.orderno+"\nDate : "+b1.date);
		System.out.println("\nProduct Id\tName\tQuantity\tUnit Price\tTotal\n-------------------------------------------------------------------------");
		System.out.println(b1.pid+"\t\t"+b1.name+"\t"+b1.qnty+"\t\t"+b1.uprice+"\t\t"+b1.total);
		System.out.println(b2.pid+"\t\t"+b2.name+"\t"+b2.qnty+"\t\t"+b2.uprice+"\t\t"+b2.total+"\n-------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t Net Amount:\t"+b1.calculate(b1.total, b2.total));
	}
}
