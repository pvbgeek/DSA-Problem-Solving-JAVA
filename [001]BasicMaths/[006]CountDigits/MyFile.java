import java.util.*;
public class MyFile
{
    static int cntdig(int x)
    {
        if(x==0)
        {return 1;}
        else
        {
            int cnt=0;
            while(x!=0)
            {
                cnt++;
                x = x/10;
            }
            return cnt;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        System.out.println("Number of digits are: " + cntdig(x));
    }
}