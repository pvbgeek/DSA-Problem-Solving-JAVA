import java.util.*;
public class MyFile
{
    static int binsrch(int[] arr , int key)
    {
        int s = 0;
        int e = arr.length-1;
        while(s<=e)
        {
            int m = (s+e)/2;
            if(arr[m] == key)
            {return m;}
            else if(arr[m]<key)
            {s = m+1;}
            else
            {e = m-1;}
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the number you wish to search:");
        int key = sc.nextInt();
        System.out.println("Index : "+binsrch(arr,key));
        sc.close();
    }
}