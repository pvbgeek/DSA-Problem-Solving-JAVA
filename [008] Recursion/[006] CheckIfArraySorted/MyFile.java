public class MyFile
{
    static boolean chksort(int[] arr , int e)
    {
        if(e==0)
        {return true;}
        if(arr[e]<arr[e-1])
        {return false;}
        return chksort(arr,e-1);
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,6,5,8,9,7};
        if(chksort(arr1 , arr1.length-1))
        {System.out.println("Array is Sorted !!");}
        else
        {System.out.println("Array is not Sorted !!");}

        if(chksort(arr2 , arr2.length-1))
        {System.out.println("Array is Sorted !!");}
        else
        {System.out.println("Array is not Sorted !!");}
    }
}