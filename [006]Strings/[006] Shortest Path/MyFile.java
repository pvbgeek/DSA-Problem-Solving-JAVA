import java.util.Scanner;
public class MyFile
{
    static double finddisp(String str)
    {
        int x=0;
        int y=0;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'N')
            {y++;}
            else if(str.charAt(i) == 'S')
            {y--;}
            else if(str.charAt(i) == 'E')
            {x++;}
            else
            {x--;}
        }
        return Math.sqrt((x*x) + (y*y));
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println("Displacement is : " + finddisp(str));
    }
}