import java.util.*;
public class Assignment {
	public static void main(String args[]){
		int m,l,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mileage of vechile");
		m=sc.nextInt();
		System.out.println("enter amount per litre of fuel");
		l=sc.nextInt();
		System.out.println("Enter distance from one way");
		d=sc.nextInt();
		int amt= (d/m)*l;
		System.out.println("amount payable by each = "+ amt/2);
		
		if(amt%2==0)
		System.out.println("TRUE");
		else
		System.out.println("FALSE");
		
	}
}
