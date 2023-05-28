public class MyFile
{
    static void printdigits(int num)
    {
        if(num==0)
        {return;}
        System.out.print(num%10 + " ");
        printdigits(num/10);
    }
    public static void main(String[] args) 
    {
        int num = 224513;
        System.out.println("Digits are : ");
        printdigits(num);
        System.out.println();    
    }
}