import java.util.*;
public class MyFile
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter elements:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Print using indexed based loop:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Print using for-each loop:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
        sc.close();
    }
}