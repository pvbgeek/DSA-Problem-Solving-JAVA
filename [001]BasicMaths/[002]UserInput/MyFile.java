import java.util.*;
public class MyFile 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Integer is: " + x);
        float y = sc.nextFloat();
        System.out.println("Float is: " + y);
        double z = sc.nextDouble();
        System.out.println("Double is " + z);
        sc.close();
    }    
}