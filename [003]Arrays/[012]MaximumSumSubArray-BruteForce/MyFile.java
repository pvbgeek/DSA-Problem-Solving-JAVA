public class MyFile
{
    static int maxsumsubarr(int[] arr)
    {
        int maxsum=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                int sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                if(sum>maxsum)
                {maxsum=sum;}
            }
        }
        return maxsum;
    }
    public static void main(String[] args) 
    {
        int[] arr = {-1,3,2,4,-8,7};
        System.out.println("Maximum sum of subarray is : " + maxsumsubarr(arr));    
    }
}