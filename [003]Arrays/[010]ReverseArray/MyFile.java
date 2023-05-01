public class MyFile
{
    static void reversearr(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;

        while(s<=e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++; e--;
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array Before Reversing");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        reversearr(arr);
        System.out.println("Array after Reversing");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        System.out.println();    
    }
}