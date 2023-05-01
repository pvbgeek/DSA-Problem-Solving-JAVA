public class MyFile
{
    static void selectionsort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int m=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[m]>arr[j])
                {m=j;}
            }
            int temp = arr[m];
            arr[m] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) 
    {
       int[] arr = {5,3,1,4,2};
        System.out.println("Before Sorting:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
        selectionsort(arr);
        System.out.println("After Sorting:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
    }
}