public class MyFile
{
    static int maxsumsubarr(int[] arr)
    {
        int currsum=0;
        int maxsum=0;

        for(int i=0; i<arr.length; i++)
        {
            currsum+=arr[i];
            if(currsum<0){currsum=0;}
            if(currsum>maxsum){maxsum=currsum;}
        }
        return maxsum;
    }
    public static void main(String[] args) 
    {
        int[] arr = {-2,3,2,4,-8,7};
        System.out.println("Maximum sum in the subarray is : " + maxsumsubarr(arr));    
    }
}