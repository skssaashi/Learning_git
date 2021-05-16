import java.util.*;
public class Coins {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of 5 and 1 rupee coin");
		int x= sc.nextInt();
		int y= sc.nextInt();
		System.out.println("enter the amount to be paid");
		int z= sc.nextInt();
		
		if(x*5+y<z)
			System.out.println("-1");
		else
		{
			int r1=z%5;
			int r5= (z-r1)/5;
			System.out.println("no of 5 ruppe coin = "+r5+"\nno of 1 rupee coin = "+r1);
		}
	}

}
