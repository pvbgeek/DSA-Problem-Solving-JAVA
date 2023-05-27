import java.util.Scanner;
public class MyFile
{
    static int chkbit(int num , int i)
    {
        int bitmask = (1<<i);

        if((num & bitmask) == 0)
        {return 0;}
        else
        {return 1;}
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer a number :");
        int num = sc.nextInt();
        System.out.println("Enter value of i :");
        int i = sc.nextInt();
        System.out.println("ith bit is : " + chkbit(num,i));
        sc.close();
    }
}