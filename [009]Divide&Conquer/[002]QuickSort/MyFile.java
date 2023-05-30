public class MyFile
{
    static void quicksort(int[] arr , int s , int e)
    {
        //base case
        if(s>=e)
        {return;}

        int pidx = partition(arr,s,e); // to get pivot index
        quicksort(arr, s, pidx-1); //left partition
        quicksort(arr, pidx+1, e); //right partition
    }

    static int partition(int[] arr , int s , int e)
    {
        int i=s-1; // start position of i
        int pivot=arr[e]; //pivot element always element at ending index
        for(int j=s; j<e; j++)
        {
            if(arr[j]<=pivot) // to make place for element less than pivot
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // to place pivot element correctly
        i++;
        int temp = arr[e];
        arr[e] = arr[i];
        arr[i] = temp;

        return i; // to return the index of pivot element
    }
    public static void main(String[] args) 
    {
        int[] arr = {6,3,9,2,8,5,-2};
        System.out.println("Before Sorting :");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
        quicksort(arr,0,arr.length-1);
        System.out.println("After Sorting :");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();    
    }
}