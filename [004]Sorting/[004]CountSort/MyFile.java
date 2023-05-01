public class MyFile
{
    static void countsort(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>largest)
            {largest = arr[i];}
        }

        int[] count = new int[largest+1];
        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
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
        countsort(arr);
        System.out.println("After Sorting:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
    }
}