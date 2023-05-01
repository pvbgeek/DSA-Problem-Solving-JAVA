import java.util.*;

public class MyFile
{
    static int gcd(int x , int y)
    {
        int ans=1;
        for(int i=1; i<=x && i<=y; i++)
        {
            if(x%i==0 && y%i==0)
            {ans=i;}
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Enter a number:");
        int y = sc.nextInt();
        System.out.println("GCD of " + x + " and " + y + " is : " + gcd(x,y));    
    }
}