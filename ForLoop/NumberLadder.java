package ForLoop;

public class NumberLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
		for(k=j-2;k>=1;k--)
		{
			System.out.print(k+" ");
		}
		
		System.out.println();
		}
			}

}
