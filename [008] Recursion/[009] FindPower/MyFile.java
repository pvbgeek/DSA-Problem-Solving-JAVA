public class MyFile
{
    static int power(int b , int i)
    {
        if(i==0)
        {return 1;}
        return b*power(b,i-1);
    }
    public static void main(String[] args) 
    {
        int b = 3;
        int i = 5;
        System.out.println("Answer is : " + power(b,i));    
    }
}