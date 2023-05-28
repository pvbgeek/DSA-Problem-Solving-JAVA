import java.util.Scanner;

public class MyFile
{
    static int getsum(int num)
    {
        if(num==1)
        {return 1;}
        return num+getsum(num-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Sum is : " + getsum(num));    
        sc.close();
    }
}