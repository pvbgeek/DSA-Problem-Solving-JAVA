public class MyFile
{
    static void printbinarystrings(int n , int lastplace , String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        printbinarystrings(n-1, 0, str+"0");
        if(lastplace==0)
        {printbinarystrings(n-1, 1, str+"1");}
    }
    public static void main(String[] args) 
    {
        int n=6;
        printbinarystrings(n,0,"");    
    }
}