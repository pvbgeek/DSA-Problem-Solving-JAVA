public class MyFile
{
    static void substr(String str , int s , int e)
    {
        for(int i=s; i<e; i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        String str = "Tony Stark - Iron Man";
        substr(str,0,10);    
    }
}