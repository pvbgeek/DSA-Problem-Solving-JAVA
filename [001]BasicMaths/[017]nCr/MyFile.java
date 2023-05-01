import java.util.*;
public class MyFile
{
    static long factorial(int num)
    {
        int ans=1;
        while(num!=0)
        {
            ans = ans*num;
            num--;
        }
        return ans;
    }
    static long nCr(int n , int r)
    {
        if(r>n)
        {return -1;}
        else
        {
            long x = factorial(n);
            long y = factorial(r);
            long z = factorial(n-r);

            return (x)/(y*z);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        long flag = nCr(n,r);
        if(flag == -1)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Value of " + n + "C" + r + " is: " + flag);
        }
    }
}