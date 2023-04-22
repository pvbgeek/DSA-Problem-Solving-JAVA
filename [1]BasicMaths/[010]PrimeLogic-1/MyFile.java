import java.util.*;
public class MyFile
{
    static boolean chkprime(int x)
    {
        int cnt=0;
        for(int i=1; i<=x; i++)
        {
            if(x%i == 0)
            {cnt++;}
        }
        if(cnt==2)
        {return true;}
        else
        {return false;}
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        if(chkprime(x))
        {System.out.println("Number is Prime");}
        else
        {System.out.println("Number is not Prime");}
    }
}