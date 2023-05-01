public class MyFile
{
    static int maxsumsubarr(int[] arr)
    {
        int currsum = 0;
        int maxsum = 0;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++)
        {prefix[i] = prefix[i-1] + arr[i];}

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                if(i==0)
                {currsum=prefix[j];}
                else
                {currsum=prefix[j] - prefix[i-1];}
                if(currsum>maxsum)
                {maxsum=currsum;}
            }
        }
        return maxsum;
    }
    public static void main(String[] args) 
    {
        int[] arr = {-2,4,3,2,-8,12};
        System.out.println("Maximum sum of SubArray is : " + maxsumsubarr(arr));    
    }
}