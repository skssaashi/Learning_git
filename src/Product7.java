import java.util.*;
public class Product7 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 3 numbers respectively");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		
		if(n1==7)
		System.out.println(n2*n3);
		else if(n2==7)
		System.out.println(n3);
		else if(n3==7)
			System.out.println("-1");
		else
			System.out.println(n1*n2*n3);
	}

}
