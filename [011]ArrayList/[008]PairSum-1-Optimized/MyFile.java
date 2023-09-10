public class MyFile
{
    static boolean findpair(int[] arr , int target)
    {
        int s = 0;
        int e = arr.length-1;

        while(s<e)
        {
            int sum = arr[s] + arr[e];
            if(sum == target)
            {return true;}

            if(sum < target)
            {s++;}
            else
            {e--;}
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 15;
        System.out.println(findpair(arr , target));

    }
}