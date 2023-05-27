import java.util.Scanner;
public class MyFile
{
    static int countsetbits(int num)
    {
        int count=0;
        while(num!=0)
        {
            if(num%2 != 0)
            {count++;}

            num = (num>>1);
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Count of Set-Bits is : " + countsetbits(num));
        sc.close();
    }
}