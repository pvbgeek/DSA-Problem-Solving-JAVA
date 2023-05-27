import java.util.Scanner;
public class MyFile
{
    static int clearrangebits(int num , int i , int j)
    {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;

        int bitmask = a|b;
        return num&bitmask;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter the value of i : ");
        int i = sc.nextInt();
        System.out.println("Enter the value of j : ");
        int j = sc.nextInt();
        System.out.println("After Modification : " + clearrangebits(num,i,j));
        sc.close();
    }
}