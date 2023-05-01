import java.util.*;
public class MyFile
{
    static String chkevod(int x)
    {
        if(x%2 == 0)
        {return "Even";}
        else
        {return "Odd";}
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Number " + x + " is : " + chkevod(x));
        sc.close();
    }
}