public class MyFile
{
    static int secsmall(int[] arr)
    {
        int smallest = Integer.MAX_VALUE;
        for(int x : arr)
        {
            if(x<smallest)
            {smallest=x;}
        }
        int ans = Integer.MAX_VALUE;
        for(int x : arr)
        {
            if(x<ans && x>smallest)
            {ans = x;}
        }
        if(ans == Integer.MAX_VALUE)
        {return -1;}
        else
        {return ans;}
    }
    public static void main(String[] args) 
    {
        int[] arr = {5,1,3,4,2};
        System.out.println("Second smallest in the array is : " + secsmall(arr));    
    }
}