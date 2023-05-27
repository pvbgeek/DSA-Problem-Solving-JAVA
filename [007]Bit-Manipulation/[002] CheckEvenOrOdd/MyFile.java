import java.util.Scanner;
public class MyFile
{
    static void chkeveodd(int num)
    {
        int bitmask = 1;
        if((num & bitmask) == 1)
        {System.out.println("Number is Odd");}
        else
        {System.out.println("Number is Even");}
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        chkeveodd(sc.nextInt());
        sc.close();
    }
}