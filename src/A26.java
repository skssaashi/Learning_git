import java.util.*;


public class A26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       int heads = sc.nextInt();
       int legs = sc.nextInt();
   int j=0,i ;
   boolean found = false;
      for( i =0;i<heads+1;i++) {
          j = heads - i;
          if ((2 * i) + (4 * j) == legs) {
              found = true;
              break;
          }
      }
      if(found)
          System.out.println(i+" "+j);
      else
          System.out.println("No solution");

    }
    }