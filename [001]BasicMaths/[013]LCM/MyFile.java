import java.util.*;

public class MyFile
{
    static int lcm(int x , int y)
    {
        int gcd = 1;
        for(int i=1; i<=x && i<=y; i++)
        {
            if(x%i==0 && y%i==0)
            {gcd=i;}
        }

        return (x*y)/gcd;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Enter a number:");
        int y = sc.nextInt();
        System.out.println("LCM of " + x + " and " + y + " is: " + lcm(x,y));    
    }
}