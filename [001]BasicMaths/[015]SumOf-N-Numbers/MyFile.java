import java.util.*;

public class MyFile
{
    static int sumN(int x)
    {
        return (x*(x+1))/2;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N:");
        int N = sc.nextInt();
        System.out.println("Sum of first " + N + " natural numbers is : " + sumN(N));    
    }
}