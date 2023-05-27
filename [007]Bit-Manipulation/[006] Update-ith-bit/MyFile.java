import java.util.Scanner;
public class MyFile
{
    static int setbit(int num , int i)
    {
        int bitmask = (1<<i);
        return num|bitmask;
    }
    static int clearbit(int num , int i)
    {
        int bitmask = ~(1<<i);
        return num&bitmask;
    }
    static int updatebit(int num , int i , int newbit)
    {
        if(newbit == 1)
        {return setbit(num,i);}
        else
        {return clearbit(num,i);}
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter the value of i : ");
        int i = sc.nextInt();
        System.out.println("Enter the value of bit : ");
        int newbit = sc.nextInt();
        System.out.println("After Modification : " + updatebit(num,i,newbit));
        sc.close();
    }
}