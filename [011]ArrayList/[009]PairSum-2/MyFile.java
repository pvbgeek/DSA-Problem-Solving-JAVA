public class MyFile
{
    static boolean findpair(int[] arr , int target)
    {
        int bp=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>arr[i+1])
            {
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        int n = arr.length;

        while(lp != rp)
        {
            int sum = arr[lp] + arr[rp];
            if(sum == target)
            {
                return true;
            }
            if(sum<target)
            {
                lp = (lp+1)%n;
            }
            else
            {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int[] arr = {11,15,6,8,9,10};
        int target = 63;
        System.out.println(findpair(arr , target));    
    }
}