public class MyFile
{
    static int LastOccurrence(int[] arr , int k , int i)
    {
        if(i==-1)
        {return -1;}
        if(arr[i] == k)
        {return i;}
        return LastOccurrence(arr, k, i-1);
    }
    public static void main(String[] args) 
    {
        int[] arr = {2 , 3 , 8 , 6 , 8 , 7 , 5 , 4 , 7 , 2 , 1};
        System.out.println("Last Occurrence found at index : " + LastOccurrence(arr,7,arr.length-1));
        System.out.println("Last Occurrence found at index : " + LastOccurrence(arr,12,arr.length-1));
    }
}