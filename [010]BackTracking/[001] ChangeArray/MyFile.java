public class MyFile
{
    static void fillarray(int[] arr , int i)
    {
        if(i == arr.length+1)
        {return;}
        arr[i-1] = i;
        fillarray(arr, i+1);
        arr[i-1] = arr[i-1] - 2;
    }
    public static void main(String[] args) 
    {
        int[] arr = new int[5];
        fillarray(arr,1);
        
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
    }
}