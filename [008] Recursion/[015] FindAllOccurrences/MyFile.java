public class MyFile
{
    static void findalloccurrence(int[] arr , int k , int i)
    {
        if(i==arr.length)
        {return;}
        if(arr[i]==k)
        {System.out.print(i+" ");}
        findalloccurrence(arr, k, i+1);
    }
    public static void main(String[] args) 
    {
        int[] arr = {2,6,4,2,3,4,4,6,2,3,7,8,6,5,5,1,2,3,5,7,8,9,2,2,3,6,5,2};
        System.out.println("Occurrences are:");
        findalloccurrence(arr,2,0);   
        System.out.println(); 
    }
}