public class MyFile
{
    static int numofways(int n)
    {
        if(n==1 || n==2)
        {return n;}

        return numofways(n-1) + (n-1)*numofways(n-2);
    }
    public static void main(String[] args) 
    {
        int n=4;
        System.out.println("Number or Ways are : " + numofways(n)); 
    }
}