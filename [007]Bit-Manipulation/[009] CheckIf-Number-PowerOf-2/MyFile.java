import java.util.Scanner;
public class MyFile
{
    static boolean chknum(int num)
    {
        if((num&(num-1)) == 0)
        {return true;}
        else
        {return false;}

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(chknum(num))
        {System.out.println(num + " is a power of 2");}
        else
        {System.out.println(num + " is not a power of 2");}
        sc.close();
    }
}