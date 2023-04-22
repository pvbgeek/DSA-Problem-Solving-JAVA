import java.util.*;

public class MyFile
{
    static void printpattern(int rows)
    {
        for(int i=rows; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Output Pattern:");
        printpattern(r);
        sc.close();    
    }
}