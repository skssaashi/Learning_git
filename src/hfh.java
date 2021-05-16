import java.util.Scanner;
public class hfh {
public static void main(String[] args) {
    System.out.println("Enter line to encode:");
    Scanner s=new Scanner(System.in);
    String input=s.nextLine();
            int len = input.length();
            int i = 0;
            int noOfOccurencesForEachChar = 0;
            char storeChar = input.charAt(0);

            String outputString = "";
            for(;i<len;i++)
            {
                if(i+1<len)
                {
                    if(input.charAt(i) == input.charAt(i+1))
                    {
                    	noOfOccurencesForEachChar++;
                    }
                    else
                    {
                        outputString = outputString + 
   Integer.toHexString(noOfOccurencesForEachChar+1) + storeChar;
                        noOfOccurencesForEachChar = 0;
                        storeChar = input.charAt(i+1);
                    }
                }
                else
                {
                    outputString = outputString + 
 Integer.toHexString(noOfOccurencesForEachChar+1) + storeChar;
                }
            }

            System.out.println("Encoded line is: " + outputString);   

        }

}
                    
                    