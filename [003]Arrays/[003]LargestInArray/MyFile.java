public class MyFile
{
    static int largest(int[] arr)
    {
        int ans = Integer.MIN_VALUE;
        for(int x : arr)
        {
            if(x>ans)
            {ans=x;}
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] arr = {5,3,4,1,2};
        System.out.println("Largest element in the array is: " + largest(arr));    
    }
}