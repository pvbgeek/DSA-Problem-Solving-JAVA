import java.util.*;
public class MyFile
{
    static boolean chkprime(int x)
    {
        for(int i=2; i<=(x/2); i++)
        {
            if(x%i == 0)
            {return false;}
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        if(chkprime(x))
        {System.out.println("Number is Prime.");}
        else
        {System.out.println("Number is not Prime.");}
    }
}