public class MyFile
{
    static String vowellowercase(String str)
    {
        String ans = "";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
            {ans+=Character.toLowerCase(str.charAt(i));}
            else
            {ans+=str.charAt(i);}
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        String str = "ApccCB qEOonmPP IIiihGGjk yyxxXXZZzuuUUzx";
        System.out.println("Original String : " + str);
        System.out.println("Modified String : " + vowellowercase(str));    
    }
}