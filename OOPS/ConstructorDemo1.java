package OOPS;

class Mno
{
	int a,b;
	public Mno()//default constructor
	{
		a=12;
		b=23;
	}
	public Mno(int x,int y)// Parametrized Constructor. 
	{
		a=x;
		b=y;
	}
	public void Show()
	{
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
	}
}
public class ConstructorDemo1 {

	public static void main(String[] args) {
		Mno obj=new Mno();
		obj.Show();
		Mno obj1=new Mno(100,50);
		obj1.Show();

	}

}
