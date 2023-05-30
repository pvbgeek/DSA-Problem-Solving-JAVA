public class MyFile
{
    static boolean searchrotsort(int[] arr , int key , int s , int e)
    {
        //base case
        if(s>e)
        {return false;}
        //logic
        int mid = s + (e-s)/2;
        if(arr[mid]==key)
        {return true;}
        
        //Line-1
        if(arr[s]<=arr[mid])
        {
            if(arr[s]<=key && arr[mid]>=key)
            {
                return searchrotsort(arr,key,s,mid-1);
            }
            else
            {
                return searchrotsort(arr,key,mid+1,e);
            }
        }

        //Line-2
        else
        {
            if(arr[mid]<=key && arr[e]>=key)
            {
                return searchrotsort(arr, key, mid+1, e);
            }
            else
            {
                return searchrotsort(arr, key, s, mid-1);
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {4,5,6,7,0,1,2,3};
        int key = 0;
        System.out.println(searchrotsort(arr, key, 0, arr.length-1));    
    }
}