import java.util.Scanner;
public class MyFile
{
    static int clearbit(int num , int i)
    {
        int bitmask = ~(1<<i);
        return num&bitmask;
    }
    static int clearlastbits(int num , int i)
    {
        int ans=num;
        for(int j=0; j<i; j++)
        {
            ans = clearbit(ans,j);
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        System.out.println("Enter value of i : ");
        int i = sc.nextInt();
        System.out.println("After Modification : " + clearlastbits(num , i));
        sc.close();
    }
}