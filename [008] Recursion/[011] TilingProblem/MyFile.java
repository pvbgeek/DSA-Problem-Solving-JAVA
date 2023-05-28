public class MyFile
{
    static int tiling(int n)
    {
        if(n==0 || n==1)
        {return 1;}

        return tiling(n-1) + tiling(n-2);
    }
    public static void main(String[] args) 
    {
        int n=4;
        System.out.println("Number or ways are : " + tiling(n));    
    }
}