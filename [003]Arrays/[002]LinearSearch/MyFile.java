import java.util.*;

public class MyFile
{
    static int lnrsrch(int[ ]arr , int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
            {return i;}
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,4,1,2};
        System.out.println("Enter the element you wish to search:");
        int key = sc.nextInt();
        int ans = lnrsrch(arr,key);
        if(ans == -1)
        {System.out.println("Element is not present in the array");}
        else
        {System.out.println("Element present at index " + ans);}
        sc.close();
    }
}