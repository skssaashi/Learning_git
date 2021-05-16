import java.util.*;
import java.lang.*;
public class Bill {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter V for vegetrain Combo and N for non-vegetarian combo");
		String type= sc.next();
		System.out.println("enter Distance in kms must be greater than 0");
		int d=sc.nextInt();
		System.out.println("Quantity ordered should be minimum 1");
		int q=sc.nextInt();
		
		if(type.equalsIgnoreCase("V") && d>0 && q>=1)
		{
			if(d<=3)
				System.out.println(q*120);
			else if(d<=6)
				System.out.println((q*120+((d-3)*3)));
			else
				System.out.println((q*120+9)+((d-6)*6));
		}
		
		else if(type.equalsIgnoreCase("N") && d>0 && q>1)
		{
			if(d<=3)
				System.out.println(q*150);
			else if(d<=6)
				System.out.println((q*150+((d-3)*3)));
			else
				System.out.println((q*150+9)+((d-6)*6));
		}
		else
			System.out.println("-1");
	}

}
