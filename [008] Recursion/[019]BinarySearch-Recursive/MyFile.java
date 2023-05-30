public class MyFile
{
    static boolean binsrch(int[] arr , int key, int s , int e)
    {
        if(s>e)
        {return false;}

        int mid = s + (e-s)/2;
        if(arr[mid]==key)
        {return true;}
        
        if(arr[mid]<key)
        {return binsrch(arr, key, mid+1, e);}
        else
        {return binsrch(arr, key, s, mid-1);}
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key=3;
        System.out.println(binsrch(arr,key,0,arr.length-1));
    }
}