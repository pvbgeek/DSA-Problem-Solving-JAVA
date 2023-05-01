import java.util.*;
public class MyFile
{
    static void digitseperate(int x)
    {
        System.out.println("Digits are:");
        while(x!=0)
        {
            int d = x%10;
            System.out.print(d + " ");
            x = x/10;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        digitseperate(x);
        sc.close();
    }
}