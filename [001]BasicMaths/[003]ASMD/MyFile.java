import java.util.*;
public class MyFile
{
    static int add(int x , int y)
    {return (x+y);}

    static int sub(int x , int y)
    {return (x-y);}

    static int mul(int x , int y)
    {return (x*y);}

    static double div(int x , int y)
    {return (x/(y*1.0));}
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int x = sc.nextInt();
        System.out.println("Enter a number :");
        int y = sc.nextInt();

        System.out.println("Addition is : " + add(x,y));
        System.out.println("Subtraction is: " + sub(x,y));
        System.out.println("Multiplication is: " + mul(x,y));
        System.out.println("Division is : " + div(x,y));
    }
}