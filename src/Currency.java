import java.util.*;
import java.lang.*;
public class Currency {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount needed in INR"); 
		int amt= sc.nextInt();
		System.out.println("enter the type of currency user has ");
		String type= sc.next();
		
		if(type.equalsIgnoreCase("Euro"))
			System.out.println("the amount to be provided in "+type+" is ="+ (amt*0.01417));
		else if(type.equalsIgnoreCase("British Pound"))
			System.out.println("the amount to be provided in "+type+" is ="+ (amt*0.01000));
		else if(type.equalsIgnoreCase("Australian Dollar"))
			System.out.println("the amount to be provided in "+type+" is ="+ (amt*0.02140));
		else if(type.equalsIgnoreCase("Canadian Dollar"))
			System.out.println("the amount to be provided in "+type+" is ="+ (amt*0.02027));
		else
			System.out.println(-1);
		
	}

}
