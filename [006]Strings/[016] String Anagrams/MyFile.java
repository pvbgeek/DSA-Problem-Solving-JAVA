import java.util.Arrays;
public class MyFile
{
    static boolean chkanagrams(char[] str1 , char[] str2)
    {
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0; i<str1.length || i<str2.length; i++)
        {
            if(str1[i]!=str2[i])
            {return false;}
        }
        return true;
    }
    public static void main(String[] args) 
    {
        char[] str1 = {'e','x','c','e','p','t'};
        char[] str2 = {'e','x','p','e','c','t'};
        if(chkanagrams(str1,str2))
        {System.out.println("Strings are Anagrams");}
        else
        {System.out.println("Strings are not Anagrams");}    
    }
}