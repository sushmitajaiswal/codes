package ForLoop;
//Print 1-2+3-4...10
public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.print("-"+i);
			else if (i==1)
				System.out.print(i);
			else
				System.out.print("+"+i);
		}
	}

}
