public class MyFile
{
    static int smallest(int[] arr)
    {
        int ans = Integer.MAX_VALUE;
        for(int x : arr)
        {
            if(x<ans)
            {ans=x;}
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] arr = {5,3,4,1,2};
        System.out.println("Smallest element in the array is : " + smallest(arr));    
    }
}