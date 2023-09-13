public class MyFile
{
    static StringBuilder ans = new StringBuilder("");
    static void revstr(String str , int idx)
    {
        if(idx == str.length())
        {return;}
        char ch = str.charAt(idx);
        revstr(str , idx+1);
        ans.append(ch);

    }
    public static void main(String[] args) 
    {
        String str = "PVB-GEEK";
        revstr(str,0);
        System.out.println("String after Reversing is : "  + ans);
    }
}