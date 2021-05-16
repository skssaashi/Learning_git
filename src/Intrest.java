import java.util.*;
public class Intrest {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Principal Rate time respectively");
		int p= sc.nextInt();
		int r= sc.nextInt();
		int t= sc.nextInt();
		
		int i=(p*r*t)/100;
		System.out.println("the intrest is = "+i);
	}

}
