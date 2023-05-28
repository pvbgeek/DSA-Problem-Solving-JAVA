import java.util.Scanner;

public class MyFile
{
    static int fibo(int n)
    {
        if(n<=1)
        {return n;}
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        System.out.println(n + "th term of fibonacci sequence is : "+ fibo(n));
        sc.close();
    }
}