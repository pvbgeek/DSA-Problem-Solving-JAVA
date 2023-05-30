public class MyFile
{
    static void mergesort(int[] arr , int s , int e)
    {
        //base case
        if(s>=e)
        {return;}
        //logic
        int mid = s+(e-s)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid+1,e);

        merge(arr,s,mid,e);
    }

    static void merge(int[] arr , int s , int mid , int e)
    {
        int[] temp = new int[e-s+1];
        int i=s; //iterator for left-part
        int j=mid+1; //iterator for right-part
        int k=0; //iterator for temp array

        while(i<=mid && j<=e) // to traverse both left & right part simultaneously
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                k++;
                i++;
            }
            else
            {
                temp[k]=arr[j];
                k++;
                j++;
            }
        }

        while(i<=mid) //to traverse remaining part of left array
        {
            temp[k++] = arr[i++];
        }
        
        while(j<=e) //to traverse remaining part of right array
        {
            temp[k++] = arr[j++];
        }

        //COPY temp array to original array
        for(k=0 , i=s; k<temp.length; k++ , i++)
        {
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) 
    {
        int[] arr = {6,3,9,2,5,8};
        System.out.println("Before Sorting :");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
        mergesort(arr,0,arr.length-1);
        System.out.println("After Sorintg :");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();    
    }
}