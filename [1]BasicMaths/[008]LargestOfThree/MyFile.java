import java.util.*;
public class MyFile
{
    static int grtthree(int x , int y , int z)
    {
        if(x>y && x>z)
        {return x;}
        else if(y>z && y>x)
        {return y;}
        else
        {return z;}
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Enter a number:");
        int y = sc.nextInt();
        System.out.println("Enter a number:");
        int z = sc.nextInt();
        System.out.println("Greatest of Three is: " + grtthree(x,y,z));
    }
}