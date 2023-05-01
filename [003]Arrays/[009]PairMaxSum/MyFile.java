public class MyFile
{
    static int maxsumpair(int[] arr)
    {
        int maxsum=0;
        for(int i=0; i<arr.length; i++)
        {
            int sum=0;
            for(int j=i+1; j<arr.length; j++)
            {
                sum = arr[i] + arr[j];
                if(maxsum < sum)
                {maxsum = sum;}
            }
        }
        return maxsum;
    }
    public static void main(String[] args) 
    {
        int[] arr = {5,1,3,4,2};
        System.out.println("Maximum sum of pair is : " + maxsumpair(arr));    
    }
}