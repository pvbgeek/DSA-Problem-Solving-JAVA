public class MyFile
{
    static void bubblesort(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {5,3,1,4,2};
        System.out.println("Before Sorting:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
        bubblesort(arr);
        System.out.println("After Sorting:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
    }
}