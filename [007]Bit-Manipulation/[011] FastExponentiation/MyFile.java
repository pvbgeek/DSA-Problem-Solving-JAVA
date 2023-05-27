import java.util.Scanner;

public class MyFile
{
    static long fastexpo(int b , int e) // Time Complexity : O(lon(N))
    {
        long ans=1;
        while(e!=0)
        {
            if((b&1) != 0)
            {ans = ans*b;}
            b = b*b;
            e = e>>1;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base :");
        int b = sc.nextInt();
        System.out.println("Enter power :");
        int e = sc.nextInt();
        System.out.println("Answer is : " + fastexpo(b,e));
        sc.close();
    }
}