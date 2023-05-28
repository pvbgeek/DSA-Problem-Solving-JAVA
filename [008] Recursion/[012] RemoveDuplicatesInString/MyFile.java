public class MyFile
{
    static void removeduplicates(String str , int i , StringBuilder sb , boolean map[])
    {
        if(i==str.length())
        {
            System.out.println(sb.toString());
            return;
        }
        char ch = str.charAt(i);
        if(map[ch-'a'])
        {
            removeduplicates(str, i+1, sb, map);
        }
        else
        {
            map[ch-'a']=true;
            removeduplicates(str, i+1, sb.append(ch), map);
        }
    }
    public static void main(String[] args) 
    {
        String str = "aaaabbbbaacccbbbbaaffffddddffgaabcddgggjjjjihhiiiabcde";
        System.out.println("Modified String : ");
        removeduplicates(str , 0 , new StringBuilder("") , new boolean[26]);    
    }
}