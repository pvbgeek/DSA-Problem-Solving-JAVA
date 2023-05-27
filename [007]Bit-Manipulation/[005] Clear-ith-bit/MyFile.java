import java.util.Scanner;
public class MyFile
{
    static int clearbit(int num , int i)
    {
        int bitmask = ~(1<<i);
        return num&bitmask;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        System.out.println("Enter the value of i :");
        int i = sc.nextInt();
        System.out.println("After Modification : " + clearbit(num,i));
        sc.close();
    }
}