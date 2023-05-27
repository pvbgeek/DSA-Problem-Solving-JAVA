public class MyFile
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a' ; ch<='j' ; ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}