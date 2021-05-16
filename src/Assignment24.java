import java.util.*;


public class Assignment24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if(side1+side2>side3) {
            if (side3 + side2 > side1) {
                if (side1 + side3 > side2)
                    System.out.println("triangle can be formed");

            }
        }
        else
            System.out.println("triangle cannot be formed");
    }
    }