import java.util.*;
public class Array {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {4,0,2,1,3};
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[arr[i]];
			System.out.println(arr[i]);
		}
	}}