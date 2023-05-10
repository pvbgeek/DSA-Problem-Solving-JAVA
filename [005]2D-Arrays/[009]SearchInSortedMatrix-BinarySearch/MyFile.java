public class MyFile
{
    static boolean binarysearch(int[] arr , int key,int r)
    {
        int s=0;
        int e=arr.length-1;

        while(s<=e)
        {
            int m=(s+e)/2;
            if(arr[m] == key)
            {System.out.println("Element found at : (" + r + "," + m + ")");return true;}
            else if(arr[m]<key)
            {s=m+1;}
            else
            {e=m-1;}
        }
        return false;
    }
    static boolean matsearch(int[][] mat , int key)
    {
        for(int i=0; i<mat.length; i++)
        {
            if(binarysearch(mat[i],key,i))
            {return true;}
        }
        System.out.println("Element Not Found !!");
        return false;
    }
    public static void main(String[] args) 
    {
        int[][] mat = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=29;
        matsearch(mat,key);    
    }
}