import java.util.*;
public class Salary {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter job level and current salary respectively");
		int jl=sc.nextInt();
		int cs=sc.nextInt();
		
		if(jl==3)
		{
			System.out.println("new salary= "+ (cs+(cs*0.15)));
		}
		else if(jl==4)
		{
			System.out.println("new salary= "+ (cs+(cs*0.07)));
		}
		else if(jl==5)
		{
			System.out.println("new salary= "+ (cs+(cs*0.05)));
		}
		else
			System.out.println("new salary= "+cs);
	}

}
