import java.util.*;
public class MyFile
{
    static int revnum(int x)
    {
        int rev=0;
        while(x!=0)
        {
            int d = x%10;
            rev = (rev*10) + d;
            x = x/10;
        }

        return rev;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Reverse Number is : " + revnum(x));
    }
}