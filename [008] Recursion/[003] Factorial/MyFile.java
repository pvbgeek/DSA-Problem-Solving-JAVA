import java.util.Scanner;
public class MyFile
{
    static int fact(int num)
    {
        if(num==0)
        {return 1;}
        return num*fact(num-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Factorial is : " + fact(num));
        sc.close();    
    }
}