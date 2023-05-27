import java.util.Scanner;
public class MyFile
{
    static boolean chkpalindrome(String str)
    {
        int s=0;
        int e=str.length()-1;

        while(s<=e)
        {
            if(str.charAt(s) != str.charAt(e))
            {return false;}

            s++;
            e--;
        }

        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        sc.close();
        if(chkpalindrome(str))
        {System.out.println("String is a Palindrome");}
        else
        {System.out.println("String is not a Palindrome");}
    }
}