import java.util.*;
public class MyFile
{
    static int grttwo(int x , int y)
    {
        if(x>y)
        {return x;}
        else
        {return y;}
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Enter a number:");
        int y = sc.nextInt();
        System.out.println("Greatest of two is: " + grttwo(x,y));
    }
}