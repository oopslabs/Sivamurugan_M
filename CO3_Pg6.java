interface cal{
	double area();
	double perimeter();
}
class circle implements cal{
	int r;
	circle(int r){
		this.r=r;
	}
	public double area() {
		return(3.14*r*r);
	}
	public double perimeter() {
		return(3.14*2*r);
	}
}
class rectangle implements cal{
	int l,b;
	rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public double area() {
		return(l*b);
	}
	public double perimeter() {
		return(2*(l+b));
	}
}
public class CO3_Pg6 {
	public static void main(String [] args) {
		circle c=new circle(5);
		System.out.println("....Circle....\nArea : "+c.area()+"\nPerimeter : "+c.perimeter());
		rectangle r=new rectangle(5,5);
		System.out.println("\n....Rectangle....\nArea : "+r.area()+"\nPerimeter : "+r.perimeter());
	}
}
