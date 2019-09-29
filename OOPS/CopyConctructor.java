package OOPS;
class Asd
{
	String name;
	int sal,date;
	Asd(String str,int s,int d)
	{
		name=str;
		sal=s;
		date=d;
	}
	Asd(Asd obj)
	{
		name=obj.name;
		sal=obj.sal;
		date=obj.date;
	}
	public void show()
	{
		System.out.println("Name is "+name);
		System.out.println("Salary is "+sal);
		System.out.println("Date  is "+date);
	}
}

public class CopyConctructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Asd first=new Asd("Sush",20000,4);
Asd second=new Asd(first);
first.show();
second.show();
	}

}
