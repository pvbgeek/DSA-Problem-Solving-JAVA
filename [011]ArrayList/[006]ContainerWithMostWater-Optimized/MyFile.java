public class MyFile
{
    public static void main(String[] args) 
    {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        
        int maxwater = 0;

        int s = 0;
        int e = arr.length-1;

        while(s<e)
        {
            int ht = Math.min(arr[s] , arr[e]);
            int wt = e-s;
            int currwater = ht*wt;

            maxwater = Math.max(currwater , maxwater);

            if(arr[s]<arr[e])
            {s++;}
            else
            {e--;}
        }

        System.out.println("Maximum Water is : " + maxwater);
    }
}