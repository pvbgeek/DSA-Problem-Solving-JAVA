public class MyFile
{
    static int firstOccurrence(int[] arr , int k , int i)
    {
        if(i==arr.length)
        {return -1;}
        if(arr[i] == k)
        {return i;}
        return firstOccurrence(arr, k, i+1);
    }
    public static void main(String[] args) 
    {
        int[] arr = {2 , 3 , 8 , 6 , 8 , 7 , 5 , 4 , 7 , 2 , 1};
        System.out.println("First Occurrence found at index : " + firstOccurrence(arr,7,0));
        System.out.println("First Occurrence found at index : " + firstOccurrence(arr,12,0));
    }
}