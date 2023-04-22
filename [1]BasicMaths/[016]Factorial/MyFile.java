import java.util.*;
public class MyFile
{
    static long factorial(int x)
    {
        long ans=1;
        while(x!=0)
        {
            ans = ans*x;
            x--;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Factorial of " + x + " is: " + factorial(x));
        sc.close();
    }
}