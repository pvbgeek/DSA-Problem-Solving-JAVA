public class MyFile
{
    static int seclarge(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        for(int x : arr)
        {
            if(x>largest)
            {largest=x;}
        }
        int ans = Integer.MIN_VALUE;
        for(int x : arr)
        {
            if(x>ans && x<largest)
            {ans = x;}
        }
        if(ans == Integer.MIN_VALUE)
        {return -1;}
        else
        {return ans;}
    }
    public static void main(String[] args) 
    {
        int[] arr = {5,1,3,4,2};
        System.out.println("Second smallest in the array is : " + seclarge(arr));    
    }
}