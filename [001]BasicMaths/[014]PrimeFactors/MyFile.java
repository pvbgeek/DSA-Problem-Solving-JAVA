import java.util.*;

public class MyFile
{
    static boolean chkprime(int y)
    {
        for(int i=2; i<=(y/2); i++)
        {
            if(y%i == 0)
            {return false;}
        }
        return true;
    }
    static void primefactors(int x)
    {
        for(int i=2; i<=x; i++)
        {
            if(x%i == 0 && chkprime(i))
            {System.out.print(i + " ");}
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Prime Factors of " + x + " are:");
        primefactors(x);
        System.out.println();    
    }
}