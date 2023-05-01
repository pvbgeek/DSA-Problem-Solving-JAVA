import java.util.*;
public class MyFile
{
    public static void main(String[] args) 
    {
        int[] arr = {5,3,1,4,2};
        System.out.println("Before Sorting:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
        
        Arrays.sort(arr);

        System.out.println("After Sorting:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
    }
}