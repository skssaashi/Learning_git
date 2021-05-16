import java.util.*;
public class Loan {
	public static void main(String args[])
	{
		int account_number, account_balance, salary, loan_amount_expected ,customer_emi_expected;
		String loan_type;
				
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the account number, should be of 4 digits and its first digit should be 1");
		account_number= sc.nextInt();
		System.out.println("enter account_balance");
		account_balance=sc.nextInt();
		System.out.println("salary");
		salary=sc.nextInt();
		System.out.println("salary loan_type");
		loan_type=sc.next();
		System.out.println("loan_amount_expected");
		loan_amount_expected=sc.nextInt();
		System.out.println("customer_emi_expected");
		customer_emi_expected=sc.nextInt();
		
		int n=account_number,c=0;
		while(n>0)
		{
			c++;
			n/=10;
		}
		
		if(c==4&&(account_number/1000)==1)
		{
			if(account_balance>=100000)
			{
				
			}
		}
		
		
		
	}

}
