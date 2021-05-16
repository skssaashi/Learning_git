import java.util.*;
public class String_Palindrome {
	    static boolean isPalindrome(String str) 
	    { 
	        int i = 0, j = str.length() - 1; 
	        
	        while (i < j) { 
	  
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	  
	            i++; 
	            j--; 
	        } 
	  
		        return true; 
	    } 
	    public static void main(String[] args) 
	    { 
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the string to check for palindrome");
	        String str= sc.next();
	        if (isPalindrome(str)) 
	            System.out.print("True"); 
	        else
	            System.out.print("False"); 
	        
	        
	    } 
	} 


