public class MyFile
{
    static int gcd(int a , int b)
    {
        if(a==0)
        {return b;}
        if(b==0)
        {return a;}

        if(a>b)
        {return gcd(a-b,b);}
        else
        {return gcd(a,b-a);}
    }
    public static void main(String[] args) 
    {
        int a=15;
        int b=20;
        System.out.println("GCD is : " + gcd(a,b));
    }
}