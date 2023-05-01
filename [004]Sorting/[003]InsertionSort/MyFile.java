public class MyFile
{
    static void insertionsort(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {5,3,1,4,2};
        System.out.println("Before Sorting:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
        insertionsort(arr);
        System.out.println("After Sorting:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
    }
}