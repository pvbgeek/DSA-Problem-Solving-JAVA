import java.util.*;
public class MyFile
{
    static int bintodec(int b)
    {
        int pow=0;
        int ans = 0;
        while(b!=0)
        {
            int ld = b%10;
            ans = ans + (ld*(int)Math.pow(2,pow));
            pow++;
            b=b/10;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in a binary format:");
        int b = sc.nextInt();
        System.out.println("Decimal equivalent of " + b + " is: " + bintodec(b));
        sc.close();
    }
}