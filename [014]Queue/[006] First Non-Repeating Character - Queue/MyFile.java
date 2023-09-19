import java.util.*;
public class MyFile
{

    static void nonRepeating(String str)
    {
        int[] freq = new int[26];

        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++)
        {
            char curr = str.charAt(i);
            q.add(str.charAt(i));

            freq[curr-'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1)
            {q.remove();}

            if(q.isEmpty())
            {System.out.print("-1" + " ");}
            else
            {System.out.print(q.peek() + " ");}
        }
    }
    public static void main(String[] args) 
    {
        String str = "aabccxb";
        nonRepeating(str);    
    }
}