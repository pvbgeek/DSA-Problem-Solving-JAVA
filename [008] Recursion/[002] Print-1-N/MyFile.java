import java.util.Scanner;
public class MyFile
{
    static void printnums(int num)
    {
        if(num==0)
        {return;}
        printnums(num-1);
        System.out.print(num + " ");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Numbers are : ");
        printnums(num);
        System.out.println();
        sc.close();
    }
}